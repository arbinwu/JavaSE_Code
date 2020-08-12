package myObject;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(19);
        s.setName("jack");
        System.out.println(s);
        System.out.println(s.toString());

        Student s1 = new Student();
        s1.setName("pp");
        s1.setAge(18);
        Student s2 = new Student();
        s2.setName("pp");
        s2.setAge(18);
//        System.out.println(s2);
        //比较两个对象的内容是否相同
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
