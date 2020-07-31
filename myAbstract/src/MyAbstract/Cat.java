package MyAbstract;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
//        super();
//        super.setName(name);
//        super.setAge(age);
    }
}
