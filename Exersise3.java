import java.util.Scanner;

public class Exersise3 {
    public static void main(String[] args) {
        Scanner melon = new Scanner(System.in);
        System.out.print("Enter a word ");
        String x = melon.nextLine();
        for( int i = 0; i < x.length(); i++){
            System.out.println(x);
        }
       
    }
}
