package learn;

import java.util.Date;

public class SinhVien {
    protected String ma, ten, queQuan , soDienThoai;
    protected boolean gioiTinh;
    protected int ngaySinh;
    
    public SinhVien (String ma , String ten , String queQuan , boolean gioiTinh , int ngaySinh ){
        this.ma = ma;
        this.ten = ten;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }
    
    public String getMa(){
        return ma;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }
    
    public String getTen() {
        return ten;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }
    
    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public void setMa(String ma){
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public void setQueQuan(String queQuan){
        this.queQuan = queQuan;
    }
    
    
}
