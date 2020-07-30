package com.itheima;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
//        System.out.println(s.name + s.age);

        s.name = "jack";
        int b = s.getAge();
        System.out.println(b);
        s.setAge(9);
//        System.out.println(s.name + s.age);
        System.out.println(s.getAge());
        s.study();
        s.homework();

        Student s2 = new Student("linqingxia");
        s2.homework();
        System.out.println(s2.name);
    }
}
