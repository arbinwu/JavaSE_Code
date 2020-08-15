package list_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器遍历 并发修改异常
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        //通过迭代器遍历元素时，会判断实际修改次数和预期修改次数，不相等时抛出并发修改异常
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            if (s.equals("world")) {  //ConcurrentModificationException
//                list.add("javaee");
//            }
//        }

        //for循环遍历时，没有并发修改异常
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("world")) {  //ConcurrentModificationException
                list.add("javaee");
            }
        }

        System.out.println(list);
    }
}
