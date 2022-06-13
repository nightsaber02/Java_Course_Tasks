
public class Car implements Comparable<Car> {
    private String type;
    private int yearOfProduction;
    private int engineCapasity;

    public Car(String type, int yearOfProduction, int engineCapasity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapasity = engineCapasity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapasity() {
        return engineCapasity;
    }

    public void setEngineCapasity(int engineCapasity) {
        this.engineCapasity = engineCapasity;
    }

    public String toString() {
        return ("(" + type + ", model year: " + yearOfProduction + ", engine capasity:" + engineCapasity + ")");
    }

    @Override
    public int compareTo(Car o) {
        return toString().compareTo(o.toString());
    }

}
