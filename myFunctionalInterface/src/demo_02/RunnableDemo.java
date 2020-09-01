package demo_02;

public class RunnableDemo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        //函数式表达式作为形参，可以用lambda表达式作为参数传递
        startThread(()-> System.out.println(Thread.currentThread().getName()) );
    }

    private static void startThread(Runnable r) {
//        Thread t = new Thread(r);
//        t.start();
//        System.out.println("");
        new Thread(r).start();
    }
}
