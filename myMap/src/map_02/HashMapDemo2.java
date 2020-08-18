package map_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    创建一个HashMap集合，键是学生对象，值是居住地，
    保证键的唯一性，如果学生对象的成员变量值相同，就认为是同一个对象
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Student, String> hs = new HashMap<Student, String>();
        Student s1 = new Student("pp", 10);
        Student s2 = new Student("uu", 14);
        Student s3 = new Student("yy", 17);
        Student s4 = new Student("yy", 17);

        hs.put(s1, "beijing");
        hs.put(s2, "xian");
        hs.put(s3, "pds");
        hs.put(s4,"kkk");

        Set<Map.Entry<Student, String>> entrySet = hs.entrySet();
        for (Map.Entry<Student, String> entry : entrySet
        ) {
            System.out.println(entry.getKey().getName() + "," + entry.getKey().getAge() + "," + entry.getValue());
        }

    }
}
