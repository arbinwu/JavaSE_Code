package my_01;

/*
    定义一个接口，包含两个抽象方法
    定义两个实现类
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my1 = new MyInterfaceOne();
        my1.show1();
        my1.show2();
        my1.show3();

        MyInterface my2 = new MyInterfaceTwo();
        my2.show3();
    }
}
