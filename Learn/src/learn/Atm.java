
package learn;
//import java.io.*;

import java.util.Scanner;

public class Atm {
    protected String ten, maThe , mk ;
    protected int soDu;
    
    
    public Atm (String ten , String maThe ,String mk , int soDu) {
        this.ten = ten;
        this.maThe = maThe;
        this.mk = mk;
        this.soDu = soDu;
    }
    
    public String getTen(){
        return ten;
    }
    
    public String getMaThe(){
        return maThe;
    }
    
    public String getMk(){
        return mk;
    }
    
    public void setMk(String mk){
        this.mk = mk;
    }
    
    public void setTen(String ten){
        this.ten = ten;
    }
    
    public void setMaThe(String maThe){
        this.maThe = maThe;
    }
    
    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }
    
//    public int doiTuong(String stk){
//        if (stk == kh1.getMaThe() ) 
//    }
    
    public static void main (String[] args){
        Atm kh1 = new Atm ("Tran Viet Nhan", "8143" , "1234" , 1900099 );
        Atm kh2 = new Atm ("Nguyen Van A", "8143" , "7456" , 90009);
        Atm kh3 = new Atm ("Nguyen Van B", "1234" , "3456" , 153400 );
        
        String a = null , b = null, c = null ;
    int d = 0;
        
        Scanner inp = new Scanner (System.in);
        
        String stk;
        System.out.println("====ATM====");
        System.out.println("Moi nhap so tai khoan:");
        stk = inp.nextLine();
        
        while (true){ // kiem tra tai khoan
            if ( stk.equals(kh1.getMaThe()) ) {
                a = kh1.getTen();
                b = kh1.getMaThe();
                c = kh1.getMk();
                d = kh1.getSoDu();
                break;
            } else
                if ( stk.equals(kh2.getMaThe()) ){
                    a = kh2.getTen();
                    b = kh2.getMaThe();
                    c = kh2.getMk();
                    d = kh2.getSoDu();
                    break;
                } else
                    if ( stk.equals(kh3.getMaThe()) ){
                        a = kh3.getTen();
                        b = kh3.getMaThe();
                        c = kh3.getMk();
                        d = kh3.getSoDu();
                        break;
                    } else System.out.println("Tai khoan khong ton tai !!\nMuon thoat moi nhap '0', Tiep tuc moi nhap lai :");
            stk = inp.nextLine();
            //System.out.println(stk + kh1.getMaThe());
            if ( stk.equals("0") ) break;
        }
        
        if (!stk.equals("0") ){
            int dem = 0;
            System.out.println("Moi nhap mat khau : ");
            while (true){ //nhap mat khau
                String matKhau = inp.nextLine();
                if ( !c.equals(matKhau) ) System.out.println("Nhap lai mat khau : ");
                else break;
                if (++dem > 5) {
                    System.out.println("Ban da nhap sai qua 5 lan. Moi lien he tai ngan hang de nhan lai the");
                    return;
                }
            }
            //
            
            System.out.println("===ATM===");
            System.out.println("Ten Chu Tai Khoan : " + a);
            System.out.println("So tai Khoan : " + b);
            System.out.println("So du : " + d );
            System.out.println("=================");
            int chon ;
            while (true){
                System.out.println("1 . Rut tien");
                System.out.println("2 . Chuyen Tien");
                System.out.println("3 . Doi mat khau");
                System.out.println("0. Thoat!!");
                System.out.print("Chon yeu cau : ");
                chon = inp.nextInt();
                switch (chon){
                    case 1 : d = rutTien(d);break;
                    //case 2 : chuyenTien();break;
                    case 3 : c = doiMatKhau(c);break;
                    default : return;
                }
            }
        }
    }
    
    public static String doiMatKhau(String c){
        Scanner inp = new Scanner (System.in);
        String mk ;
        System.out.println("Nhap mat khau cu : ");
        mk = inp.nextLine();
        while (true){
            if ( mk.equals(c) ) break;
            System.out.println("Mat khau sai nhap lai(nhap 0 de thoat!): ");
            mk = inp.nextLine();
            if (mk.equals("0")) return c;
        }
        
        while (true){
            System.out.println("Nhap mk moi : ");
            String mk1 = inp.nextLine();
            System.out.println("Nhap mk moi : ");
            String mk2 = inp.nextLine();
            if(mk1.equals(mk2) ) {
                mk = mk1;
                break;
            }
        }
        return mk;
    }
    
    public void chuyenTien(){
        
    }
    
    public static int rutTien(int d){
        int tien;
        Scanner inp = new Scanner (System.in);
        System.out.println("Nhap so tien can rut : ");
        tien = inp.nextInt();
        while (tien > d){
            System.out.println("Khong du tien de rut\nNhap 0 de thoat!\nNhap lai so tien : ");
            tien = inp.nextInt();
            if (tien == 0) return d;
        }
        d = d - tien;
        System.out.println("So tien con lai la : " + d);
        return d;
    }
}

