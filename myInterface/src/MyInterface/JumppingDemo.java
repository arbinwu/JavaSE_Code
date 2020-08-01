package MyInterface;

public class JumppingDemo {
    public static void main(String[] args) {
//        Jumpping j = new  Cat();
//        j.jump();
        Inter i = new InterImpl();
//        i.num = 20;   error
        System.out.println(i.num);
//        i.num2 = 30;  error
        System.out.println(i.num2);
        System.out.println(Inter.num2);

    }
}
