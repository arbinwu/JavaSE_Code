package map_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String > map =new HashMap<String, String>();

        map.put("张无忌","赵敏");
        map.put("杨过","小龙女");

        System.out.println(map);

        System.out.println(map.remove("杨过"));
        System.out.println(map.remove("杨过22"));
        System.out.println(map);

//        map.clear();
//        System.out.println(map);

        System.out.println(map.containsKey("张无忌"));
        System.out.println(map.containsValue("张无忌"));

        System.out.println(map.isEmpty());
        System.out.println(map.size());
    }
}
