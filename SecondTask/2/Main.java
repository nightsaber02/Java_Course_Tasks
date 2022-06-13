
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isPositive = true;
        int[] array= new int[10];
        int sum = 0;
        int product = 1;
        int i=0;
        System.out.println("Enter 10 Integer numbers: ");
        for(i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(array));

        for( i = 0; i < 5; i++){
            if(array[i] < 0){
                isPositive = false;
                break;
            }
        }
        if(isPositive){
            for( i = 0; i < 5; i++){
                sum +=array[i];
            }
            System.out.println("Sum of first 5 numbers: " + sum);
        }else{
            for(i = 10; i > 5; i--){
                product = product * array[i-1];
            }
            System.out.println("product of last 5 numbers: " + product);
        }

    }
}
