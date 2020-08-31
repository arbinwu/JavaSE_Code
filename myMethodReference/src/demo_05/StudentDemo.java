package demo_05;

public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder(((name, age) -> {
            Student s = new Student(name, age);
            return s;
        }));

        useStudentBuilder((name, age) -> new Student(name,age));

        //引用构造器
        //lambda表达式被构造器替代的时候，它的形参全部传递给构造器作为参数
        useStudentBuilder(Student::new);
    }

    private static void useStudentBuilder(StudentBuilder sb) {
        Student s = sb.build("yy", 18);
        System.out.println(s.getName() + "," + s.getAge());
    }
}
