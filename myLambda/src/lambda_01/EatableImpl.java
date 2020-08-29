package lambda_01;

public class EatableImpl implements Eatable{
    @Override
    public void eat() {
        System.out.println("an apple a day");
    }
}
