package study07;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Start Thread: " + mainThread.getName());

//        ThreadA threadA = new ThreadA();
//        System.out.println("Working Thread: " + threadA.getName());
//        threadA.start();
//
//        ThreadB threadB = new ThreadB();
//        System.out.println("Working Thread: " + threadB.getName());
//        threadB.start();
    }
}
