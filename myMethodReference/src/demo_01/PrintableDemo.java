package demo_01;

public class PrintableDemo {
    public static void main(String[] args) {

        usePrintable(new Printable() {
            @Override
            public void printString(String s) {
                System.out.println("hello java");
            }
        });

        usePrintable((s) -> {
            System.out.println(s);
        });

        usePrintable(s -> System.out.println(s));

        //方法引用符：::
        //可推导的就是可省略的
        usePrintable(System.out::println);

    }

    private static void usePrintable(Printable p) {
        p.printString("hello java");
    }
}
