package map_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("pp","uu");
        map.put("yy","kill");
        map.put("yy","killp");
        System.out.println(map);
    }
}
