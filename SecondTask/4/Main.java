
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // int[] numArray = new int[0];
        List<Integer> numList = new ArrayList<>();
        int product = 1;
        int num = 0;
        System.out.println("Enter numbers: ");
        for(int i = 0; true; i++){
            num = scan.nextInt();
            if(num < 0){
                System.out.println("You enter negative number, break loop");
                break;
            }else{
                numList.add(num);
            }
        }

        for (Integer integer : numList) {
            if (integer % 2 == 0) {
                product = product * integer;
            }
        }
        System.out.println("product of all entered even numbers: " + product);
    }
}
