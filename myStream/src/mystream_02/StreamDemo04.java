package mystream_02;

import java.util.ArrayList;

public class StreamDemo04 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("10");
        arrayList.add("20");
        arrayList.add("30");
        arrayList.add("40");
        arrayList.add("50");

        //转换为整数输出
//        arrayList.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
        arrayList.stream().map(Integer::parseInt).forEach(System.out::println);
        // mapToInt 返回的是IntStream类型
        arrayList.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        //int sum（） 是IntStream中的方法，返回总和
        int sum = arrayList.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
