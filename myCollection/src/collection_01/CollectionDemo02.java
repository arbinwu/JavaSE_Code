package collection_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
//        System.out.println(c.add("hello"));
//        System.out.println(c.add("world"));
//        System.out.println(c.add("world"));
        //添加元素
        c.add("hello");
        c.add("word");
        c.add("java");

        //移除指定元素
//        System.out.println(c.remove("java"));
        System.out.println(c.remove("javaee"));

        //清空集合元素
//        c.clear();

        //判断集合是否包含指定元素
        System.out.println(c.contains("java"));
        System.out.println(c.contains("javaee"));

        //判断集合是否为空
        System.out.println(c.isEmpty());
//        c.clear();
//        System.out.println(c.isEmpty());

        //集合长度
        System.out.println(c.size());

        System.out.println(c);

    }
}
