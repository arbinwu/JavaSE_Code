package list_04;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        System.out.println(linkedList);

        //在链表首尾添加指定元素
        linkedList.addFirst("javaee");
        linkedList.addLast("javase");
        System.out.println(linkedList);

        //返回链表的首尾元素
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);

        //删除链表首尾元素
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}
