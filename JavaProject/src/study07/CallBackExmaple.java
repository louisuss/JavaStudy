package study07;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallBackExmaple {
    private ExecutorService executorService;

    public CallBackExmaple() {
        executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
    }
    private CompletionHandler<Integer, Void> callback =
            new CompletionHandler<Integer, Void>() {
                @Override
                public void completed(Integer result, Void attachment) {
                    System.out.println("Completed(): " + result);
                }

                @Override
                public void failed(Throwable exc, Void attachment) {
                    System.out.println("Failed(): " + exc.toString());
                }
            };
    public void doWork(final String x, final String y) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);
                    int result = intX + intY;
                    callback.completed(result, null);
                } catch (NumberFormatException e) {
                    callback.failed(e, null);
                }
            }
        };
        executorService.submit(task);
    }
    public void finish() {
        executorService.shutdown();
    }

    public static void main(String[] args) {
        CallBackExmaple example = new CallBackExmaple();
        example.doWork("3", "3");
        example.doWork("3", "삼");
        example.finish();
    }
}
