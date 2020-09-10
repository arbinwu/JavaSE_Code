package mystream_03;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("zop");
        arrayList.add("oop");
        arrayList.add("ppp");
        arrayList.add("zoo");
        arrayList.add("eqweq");
        arrayList.add("buhs");
//        forEach 对每一个元素进行操作
        arrayList.stream().forEach(System.out::println);
//        count 返回流中的元素数
        long count = arrayList.stream().filter(s -> s.startsWith("z")).count();
        System.out.println(count);
    }
}
