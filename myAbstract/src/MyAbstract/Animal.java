package MyAbstract;
/*
    抽象类
 */
public abstract class Animal {
    private String name;
    private int age;
    private final String city = "beijing";


    public Animal() {
    }

    public Animal(String name, int age) {
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

    public String getCity() {
        return city;
    }

    //抽象方法
    public abstract void eat();

    public void show() {
        System.out.println(age);
        System.out.println(city);
    }
}
