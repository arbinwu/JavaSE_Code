package demo02;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}
