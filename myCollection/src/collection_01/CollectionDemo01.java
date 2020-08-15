package collection_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建Collection集合的对象
 * 多态的方式
 * ArrayList（）
 */

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection对象
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("word");
        c.add("java");

        System.out.println(c); //ArrayList类中重写了toString方法
    }
}
