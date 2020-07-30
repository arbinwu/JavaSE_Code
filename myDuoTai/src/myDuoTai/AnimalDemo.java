package myDuoTai;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat(); //向上转型
        a.eat();
//
//        Cat c = new Cat();
//        c.eat();
//        c.paly();
        //向下转型
        Cat c = (Cat)a;
        c.eat();
        c.paly();

    }
}
