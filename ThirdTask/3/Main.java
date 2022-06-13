
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "(?<name>\\$+[\\d]+\\.[\\d]{2})";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Enter text that contains several occurrences of US currency: ");
        Matcher matcher = pattern.matcher(scan.nextLine());
        System.out.println("occurrences of US currency");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
