package function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convert("100", s -> Integer.parseInt(s));
        convert("108", Integer::parseInt);

        convert(10, i -> String.valueOf(i + 76));

        convert("100",s -> Integer.parseInt(s),i->String.valueOf(i + 98));

    }

    //定义一个方法 把一个字符串转换为int类型输出
    private static void convert(String s, Function<String, Integer> fun) {
        System.out.println(fun.apply(s));
    }

    //定义一个方法  把一个int类型的数据加上一个整数后 转换为字符串输出
    private static void convert(int i, Function<Integer, String> fun) {
        System.out.println(fun.apply(i));
    }

    //定义一个方法 把一个字符串转换为int类型数据  再加上一个整数之后输出
    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        System.out.println(fun1.andThen(fun2).apply(s));
    }
}
