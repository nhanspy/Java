
package ATM;

public class Main {
    public static void main(String... args){
        DLNganHang Kh[] = new DLNganHang[10];
        DLNganHang.setDLNganHang(Kh);
        KhachHang Tk[] = new KhachHang[10];
        KhachHang.setKhachHang(Tk);
        
        int i = 0;
        for (DLNganHang index : Kh){ //set ma khach hang
            Tk[i++].maKh = index.maKH;
        }
        
        //KhachHang.setKhachHang(Kh);
    }
}
