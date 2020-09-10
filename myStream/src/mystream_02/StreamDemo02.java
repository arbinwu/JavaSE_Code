package mystream_02;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("zop");
        arrayList.add("oop");
        arrayList.add("ppp");
        arrayList.add("zoo");
        arrayList.add("eqweq");
        arrayList.add("buhs");

        //取前4个数据组成一个流
        Stream<String> s1 = arrayList.stream().limit(4);
        //跳过前2个数据组成一个流
        Stream<String> s2 = arrayList.stream().skip(2);
        //合并s1和s2 输出
//        Stream.concat(s1,s2).forEach(System.out::println);
        //合并s1和s2  输出不重复的元素;  两个concat不能同时使用
        Stream.concat(s1,s2).distinct().forEach(System.out::println);
    }
}
