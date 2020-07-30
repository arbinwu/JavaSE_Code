package standard_class;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("jack");
        s1.setAge(20);
        s1.show();

        Student s2 = new Student("marry",18);
        s2.show();
    }


}
