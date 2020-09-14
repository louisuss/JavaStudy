package study04;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        driver.drive(bus);

        Vehicle vehicle = new Bus();
        vehicle.run();
        Bus bus2 = (Bus)vehicle;
        bus2.checkFare();
        bus2.run();
    }
}
