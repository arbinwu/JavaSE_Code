package my_03;

public interface Inter {
    default void show1() {
        System.out.println("show1 start");
//        show();
        method();
        System.out.println("show1 end");
    }

    default void show2() {
        System.out.println("show2 start");
        show();
        System.out.println("show2 end");
    }

    static void method1() {
        System.out.println("method1 start");
        method();
        System.out.println("method1 end");
    }

    static void method2() {
        System.out.println("method2 start");
        method();
        System.out.println("method2 end");
    }

    private void show() {
        System.out.println("common show");
    }

    private static void method() {
        System.out.println("common method");
    }
}
