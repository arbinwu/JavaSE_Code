package IO_06;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();
        prop.put("01","yy");
        prop.put("02","uu");
        //遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key: keySet
             ) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}
