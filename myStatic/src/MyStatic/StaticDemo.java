package MyStatic;

public class StaticDemo {
    public static void main(String[] args) {
        Student.university = "BUPT";
        Student s = new Student();
        s.name = "jack";
        s.age = 19;
//        s.university = "BUPT";
        s.show();

        Student s2 =new Student();
        s2.name = "yy";
        s2.age = 90;
//        s2.university = "BUPT";
        s2.show();
    }
}
