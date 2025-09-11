package poly.driver;

public class MainCAr {
    public static void main(String[] args) {
        K3 car = new K3("changwan", 299);
        Driver driver = new Driver(car);

        driver.start();
        driver.drive();
        driver.stop();
    }
}
