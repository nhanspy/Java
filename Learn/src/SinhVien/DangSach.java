
package SinhVien;

import java.util.ArrayList;
//import java.util.Iterator;

public class DangSach {
    private ArrayList<SinhVien> sinhViens;
    
    public DangSach (){
        sinhViens = new ArrayList<>();
    }
    
    public boolean them(SinhVien sinhVien){
        return sinhViens.add(sinhVien);
    }
    
    private int viTri(String ma){
        for (SinhVien sV : sinhViens){
            if (sV.getMaSv().equalsIgnoreCase(ma)){
                return sinhViens.indexOf(sV);
            }
        }
        return -1;
    }
    
    public SinhVien tim(String ma){
        int index = viTri(ma);
        if (index == -1) return null;
        return sinhViens.get(index);
    }
    
    public boolean xoa (String ma){
        SinhVien sV = tim(ma);
        if (sV == null) return false;
        return sinhViens.remove(sV);
    }
    
    private float getDTBMax(){
        float max = 0;
        for (SinhVien sV : sinhViens){
            if (max <= sV.getDTB()) 
                max = sV.getDTB();
        }
        return max;
    }
    
    public ArrayList<SinhVien> layDanhSachSVDTBMax(){
        ArrayList<SinhVien> sinhVienMaxs = new ArrayList<>();
        float max = getDTBMax();
        for (SinhVien sV : sinhViens){
            if (sV.getDTB() == max){
                sinhVienMaxs.add(sV);
            }
        }
        return sinhVienMaxs;
    }
    
    public ArrayList<SinhVien> layDSSVTheoLop(String lop){
        ArrayList<SinhVien> sinhVienLops = new ArrayList<>();
        for (SinhVien sV : sinhViens){
            if (sV.getLop().equalsIgnoreCase(lop)) sinhVienLops.add(sV);
        }
        return sinhVienLops;
    }
    
    
    
}
