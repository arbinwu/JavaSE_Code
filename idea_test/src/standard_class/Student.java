package standard_class;

/*
标准类
成员变量
    使用private修饰
构造方法
    提供一个无参数构造方法
    提供一个带多个参数构造方法
成员方法
    提供每一个成员变量对应的set/get方法
    提供一个现实对象信息的show()
 */
public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法
    public Student() { }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + ',' + age);
    }
}
