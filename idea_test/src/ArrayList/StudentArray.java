package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        addStudent(array);
        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "===" + s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String age = sc.nextLine();

        Student s1 = new Student();
        s1.setName(name);
        s1.setAge(age);
        array.add(s1);
    }
}
