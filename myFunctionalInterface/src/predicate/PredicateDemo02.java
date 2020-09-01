package predicate;

import java.util.function.Predicate;

public class PredicateDemo02 {
    public static void main(String[] args) {
        boolean b = checkString("hello", s -> s.length() > 8);
        System.out.println(b);

        boolean b2 = checkString("helloworld", s -> s.length() > 8);
        System.out.println(b2);

        boolean b3 = checkString("helloworld",s -> s.length()>8,s -> s.length()<15);
        System.out.println(b3);

    }

    //同一个字符串给出两个不同的判断条件，然后做逻辑与运算
    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);

//        return pre1.or(pre2).test(s);  //逻辑或
    }

    //判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }
}
