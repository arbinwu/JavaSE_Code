package MyInterface;

//public class Cat implements Jumpping{
//    @Override
//    public void jump() {
//        System.out.println("cat jump");
//    }
//}

public class Cat extends Animal implements Jumpping{
    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }

    @Override
    public void jump() {
        System.out.println("cat jump");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}