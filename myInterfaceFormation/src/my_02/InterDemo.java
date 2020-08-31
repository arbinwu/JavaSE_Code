package my_02;

public class InterDemo {
    public static void main(String[] args) {
        Inter inter = new InterImpl();
        inter.show();
        inter.method();
//        inter.test();
        Inter.test(); //静态方法只能由接口调用

    }
}
