package myMath;

public class MathDemo {
    public static void main(String[] args) {
        //public static int abc (int a); 返回参数的绝对值
        System.out.println(Math.abs(-88));
        System.out.println(Math.abs(88));

        //public static double ceil (double a); 返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));

        //public static double floor (double a); 返回小于或等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));

        //public static int round (float a); 按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.34F));
        System.out.println(Math.round(12.56F));

        //public static double pow (double a , double b); 返回a的b次幂的值
        System.out.println(Math.max(66, 88));
        System.out.println(Math.pow(2.0, 3.0));

        //public static double random(); 返回值为double的正值，[0.0,1.0)
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 100));
    }
}
