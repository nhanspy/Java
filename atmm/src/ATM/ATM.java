
package ATM;

import java.util.Scanner;

public class ATM {
    public static void  Atm(){
        int chon;
        Scanner inp = new Scanner(System.in);
         System.out.println("=======ATM========");
         System.out.println("Nhap so tai khoan :");
         System.out.print("Nhap mat khau: ");
        while (true){
           System.out.println("=======ATM=====");
           System.out.println("1. Rut Tien");
           System.out.println("2. Chuyen Tien");
           System.out.println("3. Doi mat khau");
           System.out.println("0. Thoat");
           System.out.print("Chon yeu cau : ");
           chon = inp.nextInt();
           switch (chon){
               case 1 : rutTien();
           }
        }
    }
    
    public static void rutTien(){
        
    }
}
