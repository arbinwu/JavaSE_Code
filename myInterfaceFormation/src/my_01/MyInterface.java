package my_01;

public interface MyInterface {
    void show1();

    void show2();

    //    void show3();
    // 默认方法， 可以有方法体；  也可以被实现类重写
    public default void show3() {
        System.out.println("show3");
    }
}
