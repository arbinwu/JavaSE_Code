package InterTest;

public class PingPangPlayer extends Player implements SpearkEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学打球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃猪肉");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
