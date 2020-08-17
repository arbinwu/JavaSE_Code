package generic_03;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new GenericImpl<String>();
        g1.show("pop");

        Generic<Integer> g2 =new GenericImpl<Integer>();
        g2.show(893);
    }
}
