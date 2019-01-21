
package ATM;

public class KhachHang {
    
    String maKh  ,  tk1 , mk1 , tk2 , mk2 , tk3 , mk3;
    int soDu;
    
    public KhachHang(String maKh, int soDu , String tk1, String mk1, String tk2, String mk2, String tk3, String mk3){
        this.maKh = maKh;
        this.soDu = soDu;
        this.tk1 = tk1;
        this.mk1 = mk1;
        this.tk2 = tk2;
        this.mk2 = mk2;
        this.tk3 = tk3;
        this.mk3 = mk3;
    }
    
    public static void setKhachHang(KhachHang Tk[]){
        Tk[0] = new KhachHang(null ,199115, "1234" , "1234" , "2345", "2345", "3465", "3456");
        Tk[1] = new KhachHang(null ,9881000 , "6234",  "2345", "6545", "2345", null, null);
        Tk[2] = new KhachHang(null , 9545654 ,"6345", "1423" , null, null , null, null);
        Tk[3] = new KhachHang(null , 44440000 , "5345" , "52345" , null , null , null ,null );
    }

    
}
