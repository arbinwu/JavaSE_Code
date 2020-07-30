package demo02;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.setName("uu");
        a1.setAge(18);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();

        a1 = new Cat("ii",10);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();
    }
}
