import java.util.Scanner;

public class Exersise4 {
    public static void main(String[] args) {
        Scanner gal = new Scanner(System.in);
        System.out.print("How many integers will be added?");
        int x = gal.nextInt();
        int sum = 0;
        for( int i = 0; i < x; i++){
System.out.println("Enter an integer : ");
int y = gal.nextInt();
sum = sum + y;
        }
        System.out.println("The sum is " + sum);
    gal.close();
}
    }
