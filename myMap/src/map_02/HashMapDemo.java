package map_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<String, Student>();
        Student s1 = new Student("pp", 10);
        Student s2 = new Student("uu", 14);
        Student s3 = new Student("yy", 17);

        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);

        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student> entry : entrySet
        ) {
            System.out.println(entry.getKey() + "," + entry.getValue().getName() + "," + entry.getValue().getAge());
        }

    }
}
