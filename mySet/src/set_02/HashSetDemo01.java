package set_02;

import java.util.HashSet;

public class HashSetDemo01 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("hello");
        hs.add("world");
        hs.add("java");

        hs.add("java");
        for (String s: hs
             ) {
            System.out.println(s);
        }
    }
}
