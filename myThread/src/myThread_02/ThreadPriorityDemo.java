package myThread_02;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("线程1");
        tp2.setName("线程2");
        tp3.setName("线程3");

        System.out.println(tp1.getPriority()); // 5 线程默认的优先级为5
//        System.out.println(Thread.MAX_PRIORITY); // 10
//        System.out.println(Thread.MIN_PRIORITY); // 1
//        System.out.println(Thread.NORM_PRIORITY); // 5

        // 设置线程优先级  线程优先级高只是代表抢占CPU时间片的几率高，并不一定每次都是最先执行
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
