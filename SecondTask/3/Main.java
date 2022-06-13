
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArray = new int[5];
        int positiveChek = 0;
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i<5; i++) {
            numArray[i] = scan.nextInt();
        }

        for (int i = 0; i<5; i++) {
            if (numArray[i] > 0) {
                positiveChek++;
            }
            if (positiveChek == 2) {
                System.out.println("position of second positive number: " + (i+1));
                break;
            }
        }

        int minValue = numArray[0];
        int minPosition = 0;
        for (int i = 1;i < numArray.length; i++) {
            if (numArray[i] < minValue) {
                minValue = numArray[i];
                minPosition = i;
            }
        }
        System.out.println("minimum number is: " + minValue + "  its position in the array: " + (minPosition+1));
    }
}
