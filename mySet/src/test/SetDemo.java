package test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
    获取10个1-20之间的随机数，要求随机数不能重复
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        Random r = new Random();
        while (set.size() < 10) {
            int number = r.nextInt(20) + 1;
            set.add(number);
        }

        for (Integer i : set
        ) {
            System.out.println(i);
        }
    }
}
