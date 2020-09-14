package study06;

public class CounterExample {
    public static void main(String[] args) {
        Counter cnt = null;
        for (int i = 1; i <= 50; i++) {
            cnt = new Counter(i);
            cnt = null;
            System.gc();
        }
    }
}
