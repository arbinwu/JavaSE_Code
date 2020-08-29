package lambda_03;

public class AddableDemo {
    public static void main(String[] args) {
        useAdd((int a, int b) -> {
            return a + b;
//            return a - b;   //以此部分代码实现为准
        });

    }

    private static void useAdd(Addable a) {
        int add = a.add(10, 20);
        System.out.println(add);
    }
}
