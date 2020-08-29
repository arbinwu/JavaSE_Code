package lambda_01;

public class EatableDemo {
    public static void main(String[] args) {
        Eatable e = new EatableImpl();
        useEatable(e);

        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("An apple a day");
            }
        });

        useEatable(() -> {
            System.out.println("an APPLE a day");
        });
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
