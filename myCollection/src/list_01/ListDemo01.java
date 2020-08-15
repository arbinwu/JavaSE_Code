package list_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");

        //输出集合对象
        System.out.println(list);

        //遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //指定位置插入元素
        list.add(1,"javaee");
        System.out.println(list);

        //在末尾插入元素
        list.add(5,"javaee");
        System.out.println(list);

        //删除指定索引处的元素，返回被删除的元素
        System.out.println(list.remove(1));
        System.out.println(list);

        //修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(1,"uuu"));
        System.out.println(list);

        //返回指定索引处的元素
        System.out.println(list.get(3));
        System.out.println(list);

        //通过索引遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
