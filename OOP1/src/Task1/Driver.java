package Task1;
public class Driver {
    private String name;
    private int age;
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return " is driven by "+ name +" " +age;
    }
}
