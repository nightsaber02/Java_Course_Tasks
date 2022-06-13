
import java.util.Random;

public class Employee {
    private String firstName;
    private String secondName;
    private String password;
    private String email;
    private String department;
    private String alterEmail;
    private int mailboxCapasity = 500;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlterEmail() {
        return alterEmail;
    }

    public void setAlterEmail(String alterEmail) {
        this.alterEmail = alterEmail;
    }

    public String getMailboxCapasity() {
        return (mailboxCapasity + "mb");
    }

    public void setMailboxCapasity(int mailboxCapasity) {
        this.mailboxCapasity = mailboxCapasity;
    }

    public Employee(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFullName(){
        return (firstName + " " + secondName);
    }

    public void emailGen(){
        this.email = firstName +"." + secondName + "@" + department + "." + "company.com";
    }

    public void PasswordGen(){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<6;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        this.password = sb.toString();
    }

    public void ShowInfo(){
        System.out.println("NAME: " + getFullName() + "\n DEPARTMENT: " + getDepartment() + "\n EMAIL: " + getEmail() + "\n PASSWORD: " + getPassword() + "\n MAILBOX CAPASITY: " + getMailboxCapasity() + "\n ALTER EMAIL: " + getAlterEmail() );
    }



}
