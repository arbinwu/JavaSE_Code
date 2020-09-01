package supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String string = getString(() -> "yyy");
        System.out.println(string);

        Integer i = getInteger(()->21398);
        System.out.println(i);
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }

    private static Integer getInteger(Supplier<Integer> sup) {
        return sup.get();
    }
}
