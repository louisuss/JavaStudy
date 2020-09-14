package study04;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("BUS");
    }

    public void checkFare() {
        System.out.println("CHECK");
    }
}
