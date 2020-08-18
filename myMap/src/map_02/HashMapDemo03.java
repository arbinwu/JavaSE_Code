package map_02;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

//        HashMap<Character, Integer> hm = new HashMap<Character, Integer>(); //hashmap无序
        TreeMap<Character,Integer> hm = new TreeMap<Character, Integer>(); //treemap有序

        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);

            Integer value = hm.get(key);

            if (value == null) {
                hm.put(key, 1);
            } else {
                value++;
                hm.put(key, value);
            }
        }

        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key : keySet
        ) {
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String res = sb.toString();
        System.out.println(res);
    }
}
