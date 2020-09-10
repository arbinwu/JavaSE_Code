package mystream_04;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<String>();
        manList.add("jay");
        manList.add("jj");
        manList.add("jackie");
        manList.add("llj");

        ArrayList<String> womenList = new ArrayList<String>();
        womenList.add("lxr");
        womenList.add("zmy");
        womenList.add("lqx");
        womenList.add("wzx");

        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> womenStream = womenList.stream().filter(s -> s.startsWith("l")).skip(1);
        Stream<String> stream = Stream.concat(manStream, womenStream);

        //把每一个元素作为构造方法的参数创建对象
        stream.map(Actor::new).forEach(s-> System.out.println(s.getName()));


    }
}
