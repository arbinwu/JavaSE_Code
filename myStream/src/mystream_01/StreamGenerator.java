package mystream_01;

import java.util.*;
import java.util.stream.Stream;

public class StreamGenerator {
    public static void main(String[] args) {
        //Collection体系的集合可以使用默认方法stream（）生成流
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //Map体系的集合间接的生成流
        Map<String,Integer> map = new HashMap<String, Integer>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        //数组可以通过Stream接口的静态方法of（T……values）生成流
        String[] strArray = {"hello","world"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> stringStream = Stream.of("hello", "java");
        Stream<Integer> integerStream = Stream.of(10, 20, 30);
    }
}
