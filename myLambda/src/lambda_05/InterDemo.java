package lambda_05;

import java.io.InputStreamReader;

public class InterDemo {
    public static void main(String[] args) {
        //使用lambda必须有接口，接口有且仅有一个抽象方法
        useInter(() -> System.out.println("day day up"));

        //必须要有上下文环境，才能推导出lambda对应的接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("内名内部类");
            }
        }).start();

        Runnable r = () -> System.out.println("Lambda表达式");
        new Thread(r).start();

        new Thread(() -> System.out.println("Lambda表达式2")).start();
    }

    private static void useInter(Inter i) {
        i.show();
    }
}
