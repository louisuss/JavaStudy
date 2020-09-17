package study07;

public class DataBox {
    private String data;

    public synchronized String getData() {
        if (this.data == null) {
            try {
                wait();
            } catch (Exception e) {}
        }
        String returnValue = data;
        System.out.println("Consumer Thread data: " + returnValue);
        data = null;
        notify();
        return returnValue;
    }
    public synchronized void setData(String data) {
        if (this.data != null) {
            try {
                wait();
            } catch (Exception e) {}
        }
        this.data = data;
        System.out.println("Producer Thread data: " + data);
        notify();
    }
}
