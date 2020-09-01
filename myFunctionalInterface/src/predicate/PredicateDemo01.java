package predicate;

import java.util.function.Predicate;

public class PredicateDemo01 {
    public static void main(String[] args) {
       boolean b =  checkString("hello", s -> s.length() > 8);
        System.out.println(b);
    }

    //判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre) {
//        return pre.test(s); //正常判断
        return pre.negate().test(s); //对test结果取非
    }
}
