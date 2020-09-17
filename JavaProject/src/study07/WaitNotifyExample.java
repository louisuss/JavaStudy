package study07;

public class WaitNotifyExample {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();

        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);

        producerThread.start();
        consumerThread.start();
//
//        WorkObject sharedObject = new WorkObject();
//
//        ThreadA threadA = new ThreadA(sharedObject);
//        ThreadB threadB = new ThreadB(sharedObject);
//
//        threadA.start();
//        threadB.start();
    }
}
