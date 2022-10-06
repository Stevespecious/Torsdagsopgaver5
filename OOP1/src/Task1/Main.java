package Task1;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Christian", 21);
        Car car = new Car("Mercedes", "G63", 2022, "SUV");
        car.setDriver(driver);
        System.out.println(car + car.getDriver().toString());
        Car car1 = new Car("Mercedes", "A220D", 2022, "Hatchback");
        car1.setDriver(driver);
        System.out.println(car1 + car1.getDriver().toString());
    }
}