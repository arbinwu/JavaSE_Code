package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo03 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num1 = o1.getAge() - o2.getAge();
                return num1 == 0 ? o1.getName().compareTo(o2.getName()) : num1;
            }
        });

        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);
        Student s5 = new Student("linqingxia", 33);
        Student s6 = new Student("linqingxia", 33);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6); //保证元素的唯一性，姓名和年龄相同时，认为是一个对象

        for (Student s : ts
        ) {
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}
