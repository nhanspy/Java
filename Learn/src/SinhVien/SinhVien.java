
package SinhVien;

public class SinhVien {
    String maSv , tenSv, lop, gioiTinh, ngaySinh ;
    float DTB;
    
    public SinhVien(String maSv , String tenSv ,String lop, String gioiTinh , String ngaySinh , float DTB){
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.DTB = DTB;
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDTB() {
        return DTB;
    }

    public void setDTB(float DTB) {
        this.DTB = DTB;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
}
