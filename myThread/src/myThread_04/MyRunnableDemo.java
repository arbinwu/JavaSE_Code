package myThread_04;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        Thread t3 = new Thread(mr,"TH3");

        t1.start();
        t2.start();
        t3.start();

    }
}
