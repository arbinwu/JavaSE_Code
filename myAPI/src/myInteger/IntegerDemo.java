package myInteger;

/**
 * int 和 String的相互转换
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int number = 100;
        String s1 = "" + number;
        System.out.println(s1);

        String s2 = String.valueOf(number);
        System.out.println(s2);

        System.out.println("----------");

        String s = "100";
        Integer i1 = Integer.valueOf(s);
        int x = i1.intValue();
        System.out.println(x);

        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
