package MyInterface;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();

        Animal a = new Cat();
        a.eat();
//        a.jump();
        a = new Cat("uu",6);
        a.eat();

        Cat c = new Cat();
        c.setAge(7);
        c.setName("pp");
        c.eat();
        c.jump();

    }
}
