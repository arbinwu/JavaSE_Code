package mystream_01;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("zoo");
        list.add("oda");
        list.add("zzzo");

        ArrayList<String> zList = new ArrayList<String>();
        for (String s : list
        ) {
            if (s.startsWith("z")) {
                zList.add(s);
            }
        }

        System.out.println(zList);

        ArrayList<String> threeList = new ArrayList<String>();
        for (String s : zList
        ) {
            if (s.length() == 3) {
                threeList.add(s);
            }
        }

        System.out.println(threeList);
        System.out.println("----------------");

        //Stream流方式改进
        list.stream().filter(s -> s.startsWith("z")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
