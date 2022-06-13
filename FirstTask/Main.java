
public class Main {

    public static void main(String[] args) {
        Person person2 = new Person("Gregory", 2001);
        Person person3 = new Person("Artem", 2003);
        Person person4 = new Person("Moysha", 1992);
        Person person5 = new Person("Volodymyr", 1999);
        Person person1 = new Person("Petro", 1996);
        person1.output();
        person1.changeName("Shrek");
        person1.output();
        person1.input("Tom", 1998);
        person1.output();
    }
}
