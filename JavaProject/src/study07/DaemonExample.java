package study07;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println("Main Exit");
    }
}
