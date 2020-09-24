package reflect_02;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取该类对应的Class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);     //reflect_02.Student

        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);   //true
        System.out.println("----------------------");

        //调用对象的getClass（）方法，返回对象所属类的Class对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3);
        System.out.println(c1 == c3);
        System.out.println("----------------------");

        //使用Class类中的静态方法forName（String className）
        Class<?> c4 = Class.forName("reflect_02.Student");
        System.out.println(c4 == c1);
    }
}
