
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstname, secondName;
        int choice;
        System.out.println("Enter your first name: ");
        firstname = scan.nextLine();
        System.out.println("Enter your last name: ");
        secondName = scan.nextLine();
        Employee person = new Employee(firstname, secondName);
        System.out.println("New employee: " + person.getFullName());
        System.out.println("""
                Department codes:\s
                1. For Sales
                2. For Development\s
                3. For Accounting""");
        System.out.println("Enter your Department codes");
        choice = scan.nextInt();
        if (choice == 1){
            person.setDepartment("Sales");
            person.setDepartment("Sales");
        }else if (choice == 2){
            person.setDepartment("Development");
            person.setDepartment("Development");
        }else if (choice == 3){
            person.setDepartment("Accounting");
            person.setDepartment("Accounting");
        }
        person.emailGen();
        person.PasswordGen();
        while (true) {
            System.out.println("*******************");
            System.out.println("""
                    Enter your choice:\s
                    1. Show info
                    2. change password
                    3. Change mailbox capasity
                    4. Set alternate email
                    5. Exit""");
            choice = scan.nextInt();
            if (choice == 1) {
                person.ShowInfo();
            } else if (choice == 2) {
                System.out.println("Enter new password: ");
                person.setPassword(scan.next());
                System.out.println("Your new password: " + person.getPassword());
            } else if (choice == 3) {
                System.out.println("Enter new mailbox capasity: ");
                person.setMailboxCapasity(scan.nextInt());
                System.out.println("Your new mailbox capasity: " + person.getMailboxCapasity());
            } else if (choice == 4) {
                System.out.println("Enter new alternate Email: ");
                person.setAlterEmail(scan.next());
                System.out.println("Your new alternate Email: " + person.getAlterEmail());
            } else if (choice == 5) {
                break;
            }
        }

    }
}
