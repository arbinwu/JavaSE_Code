package myThread_01;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
//        my1.run();
//        my2.run();
        //启动线程
//        my1.start();
//        my2.start();
        //设置线程名称
        my1.setName("线程1");
        my2.setName("线程2");
        my1.start();
        my2.start();

        //带参构造方法  指定线程名称
        MyThread my3 = new MyThread("线程3");
        my3.start();

        //static Thread currentThread() 返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName()); //当前为main线程


    }
}
