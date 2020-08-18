package map_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo04 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("张无忌", "赵敏");
        map.put("杨过", "小龙女");

        Set<String> keySet = map.keySet();
        for (String key : keySet
        ) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println("---------------");

        Set<Map.Entry<String, String>> entries = map.entrySet(); //获取所有键值对对象的集合
        for (Map.Entry<String, String> me : entries
        )
            System.out.println(me.getKey() + " " + me.getValue());
    }
}
