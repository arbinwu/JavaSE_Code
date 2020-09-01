package consumer;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("uuu", (String s) -> System.out.println(s));
        operatorString("uyy", s -> System.out.println(s));
        operatorString("yiu", System.out::println);

        operatorString("opooo", s -> {
            System.out.println(new StringBuilder(s).reverse().toString());
        });
        operatorString("uiipoyyy", s -> System.out.println(new StringBuilder(s).reverse().toString()));
        System.out.println("-----------------");

        operatorString("pppo", s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    //定义一个方法  消费一个字符串
    private static void operatorString(String s, Consumer<String> con) {
        con.accept(s);
    }

    //定义一个方法 用不同的方式消费同一个字符串数据两次
    private static void operatorString(String s, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(s);
//        con2.accept(s);
        con1.andThen(con2).accept(s);
    }
}
