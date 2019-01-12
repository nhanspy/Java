package learn;

//import java.io.*;
import java.util.Scanner;

public class TestSinhVien {
    public static void main(String[] args){
        SinhVien sinhVien1 = new SinhVien("1" , "Nhan" , "quang binh" , true , 0);
        //BufferedReader inp = new BufferedReader( new InputStreamReader (System.in));
        Scanner inp = new Scanner(System.in);
        int ten ;
        while (true){
            try {
                ten = inp.nextInt();
                if (ten == 0 || ten > 10) throw new NumberFormatException() ;
                else break;
            } catch (Exception e){
                System.out.println("Nhap lai ten : ");
            }
        }
        
        String tmp;
        sinhVien1.setNgaySinh(ten);
        System.out.println( "Ma Sinh vien la : " + sinhVien1.getMa() + "\nTen " + sinhVien1.getTen() );
        System.out.println("Que quan : " + sinhVien1.getQueQuan() );
        tmp = sinhVien1.isGioiTinh() ?"Gioi Tinh nam " : "Gioi Tinh nu ";
        System.out.println(tmp + "\nTuoi : " + sinhVien1.getNgaySinh());
    }
}
