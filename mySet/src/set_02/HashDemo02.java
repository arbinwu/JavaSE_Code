package set_02;

import java.util.HashSet;

/*
    创建一个存储学生对象的集合，学生对象的成员变量值相同，我们就认为是同一个对象
 */
public class HashDemo02 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();

        Student s1 = new Student("uu",30);
        Student s2 = new Student("pp",30);
        Student s3 = new Student("kk",30);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        for (Student s: hs
             ) {
            System.out.println(s.getName() + " " + s.getAge());
        }
        System.out.println("----------------");
        //需要重写hashCode和equals方法  才能保证唯一性
        Student s4 = new Student("kk",30);
        hs.add(s4);
        for (Student s: hs
        ) {
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}
