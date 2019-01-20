

public class taikhoan {
    private String matk;
    private String password;
    private double sodu;
    private String tenkh;
    //Constructor
    public taikhoan(){
        matk="";
        password="";
        sodu=0;
        tenkh="";
    }
    
    public taikhoan(String matk , String password , double sodu , String tenkh){
        this.matk = matk;
        this.password = password;
        this.sodu = sodu;
        this.tenkh = tenkh;
    }
    //Ham set de thay doi gia tri cho thuoc tinh
    public void setmatk(String mtk){
        this.matk =mtk;
    }
    //Ham get de lay gia tri cua thuoc tinh
    public String getmatk(){
        return this.matk;
    }
    public void setPassword(String pass){
        this.password =pass;
    }
    //Ham get de lay gia tri cua thuoc tinh
    public String getPassword(){
        return this.password;
    }
    public void setsodu(double sd){
        this.sodu= sd;
    }
    //Ham get de lay gia tri cua thuoc tinh
    public double getsodu(){
        return this.sodu;
    }
    public void settenkh(String tkh){
        this.tenkh= tkh;
    }
    //Ham get de lay gia tri cua thuoc tinh
    public String gettenkh(){
        return this.tenkh;
    }
    public boolean ktra(String mtk, String pass){
      // Kiem tra login voi tai khoan nay  
        return mtk.equals(matk) && pass.equals(password);
    }
    public boolean ruttien(double sodu){
        // Rut tien khoi tai khoan
        if(sodu < this.sodu){
            this.sodu -=sodu;
            return true;
        }else
            return false;
    }
    public boolean them(double sodu){
        // Nop tien vao tai khoan
        if(sodu >0){
            this.sodu +=sodu;
            return true;
        }else
            return false;
    }           
}
    /*boolean withdraw(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean depost(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean checkLogin(int matk, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
*/