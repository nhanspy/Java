
package ATM;

import java.util.Scanner;

public class Main {
    
    public static void  ATM(KhachHang[] Tk , DLNganHang[] Kh){
        Scanner inp = new Scanner(System.in);
        KhachHang TaiKhoan = new KhachHang(null, 0 , null, null, null, null, null, null);
        
        while (true){
            System.out.println("=======ATM========");
            System.out.println("Nhap ma the :");
            String ma = inp.nextLine();
            System.out.print("Nhap mat khau: ");
            String mk = inp.nextLine();

            //ktra
            if (!kTra(ma,mk,Tk,Kh,TaiKhoan)) {
                System.out.println("Ma the hoac mat khau khong chinh xac\nBam (0) de Thoat , Bam (1) De nhap lai");
                int n = inp.nextInt();
                if (n == 0) return;
            } else return;
         
        }
    }
    
     public static boolean kTra(String ma , String mk , KhachHang[] Tk , DLNganHang[] Kh , KhachHang TaiKhoan ){
        for (KhachHang index : Tk){
            if ( (ma.equals(index.tk1) && mk.equals(index.mk1)) || (ma.equals(index.tk2) && mk.equals(index.mk2)) || ma.equals(index.tk3) && mk.equals(index.mk3) ) {
                ATM2(index,Kh);
                return true;
            }
        }
        return false;
    }
    
    public static void  ATM2(KhachHang TaiKhoan , DLNganHang[] Kh ){
        
        String ten = "";
        for (DLNganHang index : Kh){
            if (index.maKH.equals(TaiKhoan.maKh)) {ten = index.ten;break;}
        }
                
        System.out.println("Xin Chao " + ten);
        
        
        int chon;
        Scanner inp = new Scanner(System.in);
        while (true){
           System.out.println("=======ATM=====");
           System.out.println("1. Rut Tien");
           System.out.println("2. Chuyen Tien");
           System.out.println("3. Doi mat khau");
           System.out.println("0. Thoat");
           System.out.print("Chon yeu cau : ");
           chon = inp.nextInt();
           switch (chon){
               case 1 : rutTien(TaiKhoan);break;
           }
           if (chon == 0) return ;
        }
    }
    
    public static void rutTien(KhachHang TaiKhoan){
        Scanner inp = new Scanner(System.in);
        System.out.print("Nhap so tien: ");
        int money = inp.nextInt();
        
        if (money > TaiKhoan.soDu) System.out.println("Khong du tien de rut");
        else {
            TaiKhoan.soDu -= money;
            System.out.println("Da rut ...\nSo du hien tai: " + TaiKhoan.soDu );
        }
    }
    
    public static void main(String... args){
        DLNganHang Kh[] = new DLNganHang[10];
        DLNganHang.setDLNganHang(Kh);
        KhachHang Tk[] = new KhachHang[10];
        KhachHang.setKhachHang(Tk);
        
        int i = 0;
        for (DLNganHang index : Kh){ //set ma khach hang
            Tk[i++].maKh = index.maKH;
        }
        
        ATM(Tk,Kh);
        
        
    }

}
