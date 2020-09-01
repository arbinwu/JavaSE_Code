package demo_01;

public class myFunctionalInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my = () -> System.out.println("函数式接口");
        my.show();
    }
}
