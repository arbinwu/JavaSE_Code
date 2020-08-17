package generic_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo02 {
    public static void main(String[] args) {
        //Arrays.aslist() 返回指定数组支持固定大小的列表，可以修改，不能增删
        List<String> list = Arrays.asList("hello", "world");
//        list.add("kill");
//        list.remove("hello");
        list.set(1, "java");
        System.out.println(list);

        //list.of()返回包含任意数量元素的不可变列表，不能增删改
        List<String> list1 = List.of("hello", "world","world");
//        list1.add("java");
//        list1.remove("world");
//        list1.set(1,"java");
        System.out.println(list1);

        //Set.of()返回一个包含任意数量元素的不可变集合，不能重复，不能增删，没有修改方法
        Set<String> set = Set.of("hello", "world");
//        set.add()
//        set.remove()
        System.out.println(set);
    }
}
