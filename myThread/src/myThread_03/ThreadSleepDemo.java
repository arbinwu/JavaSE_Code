package myThread_03;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("ts1");
        ts2.setName("ts2");
        ts3.setName("ts3");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
