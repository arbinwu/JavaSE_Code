package mystream_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("zop");
        arrayList.add("oop");
        arrayList.add("ppp");
        arrayList.add("zoo");
        arrayList.add("eqweq");
        arrayList.add("buhs");
        //得到长度为3的流
        Stream<String> listStream = arrayList.stream().filter(s -> s.length() == 3);
        //收集到list集合中并遍历
        List<String> list = listStream.collect(Collectors.toList());
        for (String name : list
        ) {
            System.out.println(name);
        }

        String[] str = {"ll,19", "uu,56", "pp,30"};
        Stream<String> ages = Stream.of(str).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);
        Map<String, Integer> map = ages.collect(Collectors.toMap((s -> s.split(",")[0]), (s -> Integer.parseInt(s.split(",")[1]))));
        Set<String> keySet = map.keySet();
        for (String key : keySet
        ) {
            Integer value = map.get(key);
            System.out.println(key + "," + value);
        }


    }
}
