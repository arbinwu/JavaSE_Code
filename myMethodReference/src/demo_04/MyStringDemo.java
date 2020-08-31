package demo_04;

public class MyStringDemo {
    public static void main(String[] args) {
        useMyString((String s, int x, int y) -> {
            return s.substring(x, y);
        });

        useMyString((s, x, y) -> s.substring(x, y));

        //引用类的实例方法
        //lambda表达式被类的实例方法替代时，第一个参数作为调用者，后面的参数全部传递给该方法作为参数
        useMyString(String::substring);

    }

    private static void useMyString(MyString ms) {
        String s = ms.mySubString("HelloWorld", 2, 5);
        System.out.println(s);
    }
}
