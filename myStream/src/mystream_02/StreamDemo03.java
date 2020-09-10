package mystream_02;

import java.util.ArrayList;

public class StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("zop");
        arrayList.add("oop");
        arrayList.add("ppp");
        arrayList.add("zoo");
        arrayList.add("eqweq");
        arrayList.add("buhs");

        //按照自然顺序排序
        arrayList.stream().sorted().forEach(System.out::println);
        System.out.println("-------------");

        //按照指定比较器排序
        arrayList.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
        System.out.println("-------------");
        arrayList.stream().sorted((s1, s2) -> {
            int num1 = s1.length() - s2.length();
            int num2 = num1 == 0 ? s1.compareTo(s2) : num1;
            return num2;
        }).forEach(System.out::println);
    }
}
