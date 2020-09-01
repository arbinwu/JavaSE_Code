package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] str = {"ppp,30", "oo,34", "uuu,35", "kk,31", "www,33"};

        ArrayList<String> res = check(str, s -> s.split(",")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) > 33);
        System.out.println(res);
    }

    private static ArrayList<String> check(String[] str, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> arrayList = new ArrayList<String>();

        for (String s : str
        ) {
            if (pre1.and(pre2).test(s)) {
                arrayList.add(s);
            }
        }

        return arrayList;
    }
}
