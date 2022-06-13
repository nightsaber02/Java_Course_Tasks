
public class Person {
    private String name;
    private int birthYear;
    private String inf;

    Person(){

    }
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age(){
        return 2022-birthYear;
    }

    public void input(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public void output(){
        System.out.println( "name: " + name + "; birthYear: " + birthYear);

    }

    public void changeName(String name){
        this.name = name;
    }
}
