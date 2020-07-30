package myDuoTai;

public class Cat extends Animal{
    public int age = 20;
    public int weight = 20;
    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    public void paly() {
        System.out.println("play");
    }
}
