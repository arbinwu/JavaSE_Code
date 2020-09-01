package consumer;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String[] arr = {"uu,30", "pp,18"};

        printInfo(arr, (String str) -> {
            String name = str.split(",")[0];
            System.out.print(name);
        }, (String str) -> {
            int age = Integer.parseInt(str.split(",")[1]);
            System.out.println(age);
        });

        printInfo(arr, str -> System.out.print(str.split(",")[0]),
                str -> System.out.println(Integer.parseInt(str.split(",")[1])));

    }

    private static void printInfo(String[] str, Consumer<String> con1, Consumer<String> con2) {
        for (String s : str
        ) {
            con1.andThen(con2).accept(s);
        }
    }
}
