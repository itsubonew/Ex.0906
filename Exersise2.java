import java.util.Scanner;

public class Exersise2 {
    public static void main(String[] args) {
        Scanner jam = new Scanner(System.in);
        System.out.print("Enter the number");
       int x = jam.nextInt();
       int sum = 0;
       for( int i = 1; i <= x; i++ ){
           sum = sum + i;
       }
       System.out.println("The sum of 1 to " + x + " is " + sum);
       jam.close();
    }

}
