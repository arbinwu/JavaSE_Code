package IO_06;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("008", "pp");
        prop.setProperty("010", "hh");

        System.out.println(prop);

        System.out.println(prop.getProperty("010"));
        System.out.println(prop.getProperty("011"));

        Set<String> names = prop.stringPropertyNames();
        for (String n : names
        ) {
            System.out.println(n);
        }

    }
}
