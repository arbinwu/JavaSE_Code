package demo_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("cccc");
        array.add("aa");
        array.add("b");
        System.out.println(array);

        Collections.sort(array);
        System.out.println(array);

        Collections.sort(array, getComparator());
        System.out.println(array);
    }

    private static Comparator<String> getComparator() {
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//        return comp;

        return (s1, s2) -> s1.length() - s2.length();


    }
}
