package MyExtends;

public class Son extends Parent{
    public int height = 175;
    public int age = 20;
    public void method() {
        int age = 30;
        System.out.println("zi method used");
//        System.out.println(super.age);
//        System.out.println(height);
    }
    public void show() {
        super.show();
        System.out.println("zi show used");
    }

    public Son() {
//        super();
//        System.out.println("zi wu can");
    }
    public Son(int age) {
        this.age = age;
//        super();
//        System.out.println("zi dai can");
    }

}
