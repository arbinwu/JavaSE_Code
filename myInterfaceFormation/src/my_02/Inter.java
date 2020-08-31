package my_02;

public interface Inter {
    void show();

    default void method() {
        System.out.println("接口中的默认方法");
    }

    static void test() {
        System.out.println("接口中的静态方法");
    }
}
