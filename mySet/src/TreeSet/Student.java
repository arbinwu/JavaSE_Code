package TreeSet;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
    public int compareTo(Student o) {
//        return 0; 认为是相同元素。不进行添加
//        return 1; 认为不需要交换位置
//        return -1;  认为需要交换位置

        //按照年龄从小到大
        int num = this.age - o.age; //this 代表s2，会和s1进行比较

        //年龄相同时 按照姓名排序
        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
        return num2;
    }
}
