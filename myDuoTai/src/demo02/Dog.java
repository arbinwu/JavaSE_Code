package demo02;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
