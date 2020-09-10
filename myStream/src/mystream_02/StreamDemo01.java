package mystream_02;

import java.util.ArrayList;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("zop");
        arrayList.add("oop");
        arrayList.add("ppp");
        arrayList.add("zoo");

        //输出前三个数据
        arrayList.stream().limit(3).forEach(System.out::println);
        //跳过3个元素 输出剩下的
        arrayList.stream().skip(3).forEach(System.out::println);
        //跳过2个元素 输出剩下元素中的前两个
        arrayList.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
