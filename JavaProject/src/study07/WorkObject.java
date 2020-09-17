package study07;

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("A");
        notify();
        try {
            wait();
        } catch (Exception e) {}
    }
    public synchronized void methodB() {
        System.out.println("B");
        notify();
        try {
            wait();
        } catch (Exception e) {}
    }
}
