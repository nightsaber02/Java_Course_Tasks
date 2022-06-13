
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        int[] months ={31, 30, 29, 30, 30, 29, 28, 30, 31, 29, 30, 29};
        System.out.println("Enter number of month");
        int num = scan.nextInt();
        System.out.println("Number of days in your month is: " + months[num-1]);
    }
}
