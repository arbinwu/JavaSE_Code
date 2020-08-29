package lambda_02;

public class FlyableDemo {
    public static void main(String[] args) {

        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
            }
        });

        useFlyable((String s) ->{
            System.out.println(s);
            System.out.println("飞机");
        } );
    }
    private static void  useFlyable(Flyable f) {
        f.fly("fly to the sky");
    }
}
