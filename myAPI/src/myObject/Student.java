package myObject;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //比较地址是否相同
        if (this == o) return true;

        //判断对象是否为null，判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;

        //向下转型
        Student student = (Student) o;

        //判断参数是否相等
        if (getAge() != student.getAge()) return false;
        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

}
