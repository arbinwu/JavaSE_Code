package set_01;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");
        for (String s: set
             ) {
            System.out.println(s);
        }
        System.out.println(set);
    }
}
