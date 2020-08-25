package myThread_03;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin ts1 = new ThreadJoin();
        ThreadJoin ts2 = new ThreadJoin();
        ThreadJoin ts3 = new ThreadJoin();

        ts1.setName("ts1");
        ts2.setName("ts2");
        ts3.setName("ts3");

        ts1.start();
        try {
            ts1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ts2.start();
        ts3.start();
    }
}
