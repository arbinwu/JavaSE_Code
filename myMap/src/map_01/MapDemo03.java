package map_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("张无忌", "赵敏");
        map.put("杨过", "小龙女");

        System.out.println(map.get("杨过"));

        Set<String> s = map.keySet();
        for (String ss: s
             ) {
            System.out.println(ss);
        }

        Collection<String> values = map.values();
        for (String v: values
             ) {
            System.out.println(v);
        }
    }
}
