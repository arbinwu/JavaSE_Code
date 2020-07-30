package MyExtends;

public class Parent extends Phone{
    public int age = 40;
    public void show() {
        System.out.println("fu show used");
    }

    public Parent() {
//        System.out.println("fu wu can");
    }

    public Parent(int age) {
        this.age = age;
//        System.out.println("fu dai can");
    }
}
