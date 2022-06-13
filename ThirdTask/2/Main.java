import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        x = sc.nextLine();

        while(x.contains("  ")) {
            String replace = x.replace("  ", " ");
            x=replace;

        }
        System.out.println(x);

    }
}