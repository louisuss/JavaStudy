package study07;

public class StatePrintThread  extends Thread {
    private Thread targetThread;

    public StatePrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        while(true) {
            Thread.State state = targetThread.getState();
            System.out.println("State: " + state);

            if (state == Thread.State.NEW) {
                targetThread.start();
            }
            if (state == State.TERMINATED) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
