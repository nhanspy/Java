
package ATM;

import java.util.Date;

public class DLNganHang {

    
    String maKH, ten;
    Date ngaySinh;
    
    public DLNganHang(String a , String b , Date c) {
        this.maKH = a;
        this.ten = b;
        this.ngaySinh = c;
    }
    
    public DLNganHang(String maKH){
        this.maKH = maKH;
    }
    
    public static void setDLNganHang(DLNganHang kh[]){
        kh[0] = new DLNganHang("kh1" , "Tran Viet Nhan" , null);
        kh[1] = new DLNganHang("kh2" , "Tran Viet A" , null);
        kh[2] = new DLNganHang("kh3" , "Tran Viet B" , null);
        kh[3] = new DLNganHang("kh4" , "Tran Viet C" , null);
    }
    
}
