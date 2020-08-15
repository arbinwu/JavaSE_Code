package collection_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("word");
        c.add("java");

        Iterator<String> it = c.iterator();

//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());  NoSuchElementException

        if (it.hasNext()) {
            System.out.println(it.next());
        }

        while (it.hasNext()) {
//            System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }

    }
}
