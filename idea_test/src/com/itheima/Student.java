package com.itheima;

public class Student {
    String name;
    private int age;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println("xuexi");
    }

    public void homework() {
        System.out.println("xiezuoye");
    }

    //get//set method
    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}
