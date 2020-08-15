package list_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("---------------");
        while (lit.hasPrevious()) {
            String s = lit.previous();
            System.out.println(s);
        }

        //ListIterator add 方法  可以在遍历时插入元素
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("world")) {
                it.add("javaee");
            }
        }
        System.out.println(list);
    }
}
