package set_02;

public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("uu",30);

        //同一个对象多次调用hashCode方法返回的哈希值是相同的
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());

        Student s2 = new Student("uu",30);

        //默认情况下，不同对象的哈希值是不相同的
        //通过方法重写，可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode());

        //字符串重写了hashCode方法
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("hello".hashCode());

    }
}
