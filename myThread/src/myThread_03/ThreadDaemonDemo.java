package myThread_03;

public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1= new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("td1");
        td2.setName("td2");
        //设置主线程
        Thread.currentThread().setName("主线程");
        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
