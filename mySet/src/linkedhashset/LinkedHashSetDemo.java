package linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");

        System.out.println(linkedHashSet);
    }
}
