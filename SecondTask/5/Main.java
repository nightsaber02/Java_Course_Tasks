
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[4];
        Scanner scan = new Scanner(System.in);
        int year = 0;
        Random rand = new Random(); //instance of random class

        int int_random = rand.nextInt(10);
        for (int i = 0; i < 4; i++ ){
            int_random = rand.nextInt(10);
            cars[i] = new Car( "light car",1999 + int_random, 250 + int_random);
        }
        System.out.println("All cars: ");
        for (int i = 0; i < 4; i++ ){
            System.out.println(cars[i].toString());;
        }

        System.out.println("Enter car model year: ");
        year = scan.nextInt();
        System.out.println("Your car: ");
        for (int i = 0; i < 4; i++ ){
            if (cars[i].getYearOfProduction() == year){
                System.out.println(cars[i].toString());
            }
        }
        System.out.println("Sorted Cars: ");
        Arrays.sort(cars);
        for (int i = 0; i < 4; i++ ){

            System.out.println(cars[i].toString());

        }
    }
}
