package supplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        int[] arr = {10, 1, 9, 50};
        int m = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });

        System.out.println(m);
    }

    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
