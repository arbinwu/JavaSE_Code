package function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String s = "kkk,30";

        convert(s, s1 -> s1.split(",")[1], s2 -> Integer.parseInt(s2), integer -> integer + 70);

    }

    private static void convert(String s, Function<String, String> fun1, Function<String, Integer> fun2,
                                Function<Integer, Integer> fun3) {
        System.out.println(fun1.andThen(fun2).andThen(fun3).apply(s));
    }
}
