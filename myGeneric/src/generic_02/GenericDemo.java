package generic_02;

public class GenericDemo {
    public static void main(String[] args) {
//        Generic<String > g1 = new Generic<String>();
//        g1.show("opo");
//
//        Generic<Integer> g2 = new Generic<Integer>();
//        g2.show(1892);
//
//        Generic<Boolean> g3 = new Generic<Boolean>();
//        g3.show(false);
        Generic g = new Generic();
        g.show("opo");
        g.show(30);
        g.show(true);
    }
}
