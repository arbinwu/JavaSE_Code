package collections01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(66);
        System.out.println(list);
        //排序，按升序
        Collections.sort(list);
        System.out.println(list);
        //反转
        Collections.reverse(list);
        System.out.println(list);
        //随机排列
        Collections.shuffle(list);
        System.out.println(list);
    }
}
