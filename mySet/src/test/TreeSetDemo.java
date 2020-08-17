package test;

import java.util.Comparator;
import java.util.TreeSet;

/*
    TreeSet存储学生信息（姓名，语文，数学）， 按照总分从高到低遍历
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                int i = (o2.getChinese() + o2.getMath()) - (o1.getChinese() + o1.getMath());
                int i = o2.getSum() - o1.getSum();
                return i == 0 ? o2.getName().compareTo(o1.getName()) : i;
            }
        });

        Student s1 = new Student("uu", 98, 100);
        Student s2 = new Student("pp", 78, 68);
        Student s3 = new Student("yy", 70, 90);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student s : ts
        ) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," + s.getSum());
        }

    }
}
