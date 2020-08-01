package InterTest;

public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer p = new PingPangPlayer();
        p.setName("uu");
        p.setAge(16);
        System.out.println(p.getName() + "," + p.getAge());
        p.eat();
        p.study();
        p.speak();

        BasketballPlayer b = new BasketballPlayer("YM",30);
        System.out.println(b.getName() + "," + b.getAge());
        b.eat();
        b.study();
    }
}
