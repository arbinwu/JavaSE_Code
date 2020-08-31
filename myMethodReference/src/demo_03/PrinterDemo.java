package demo_03;

public class PrinterDemo {
    public static void main(String[] args) {
        usePrinter(s -> {
            System.out.println(s.toUpperCase());
        });

        usePrinter(s -> System.out.println(s.toUpperCase()));

        //引用对象的实例方法
        //lambda表达式被对象的实例方法替代的时候，它的形参全部传递给该方法作为参数
        PrintString ps =new PrintString();
        usePrinter(ps::printUpper);
    }

    private static void usePrinter(Printer p) {
        p.printUpperCase("hello world");
    }
}
