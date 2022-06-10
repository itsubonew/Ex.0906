import java.util.Scanner;

public class Exersise1 {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter start number" );
       int x = s.nextInt();
       System.out.print("Enter last number" );
       int y = s.nextInt();
        for(int i = x; i <= y; i++){
            System.out.println(x);
            x++;
        } s.close();
}
        
    }

