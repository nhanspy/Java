
package learn;

public class Learn {
    static String s = "Nhan";
    protected String ma;
    //private final Learn poin = new Learn();

    public static void main(String[] args) {
        Learn point = new Learn();
        Learn haha = new Learn();
        
        System.out.println(haha.ma);
        System.out.println(Learn.s);
    }
    
}
