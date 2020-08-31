package demo_02;

public class ConverterDemo {
    public static void main(String[] args) {
        useConverter(s -> {
            return Integer.parseInt(s);
        });
        useConverter(s -> Integer.parseInt(s));

        //引用类方法
        //lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数
        useConverter(Integer::parseInt);
    }

    private static void useConverter(Converter c) {
        int num = c.convert("666");
        System.out.println(num);
    }
}
