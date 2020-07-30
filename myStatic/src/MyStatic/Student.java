package MyStatic;

public class Student {
    public String name = "jay";
    public int age;
    public static String university = "BUPT";

    public void show1() {

    }

    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    public static void show3() {

    }

    public static void show4() {
        System.out.println(university);
        show3();

    }

    public void show() {
        System.out.println(name + "," + age + "," + university);
    }
}
