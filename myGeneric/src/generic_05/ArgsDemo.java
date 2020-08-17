package generic_05;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40,50));

    }

//    public static int sum(int b,int... a)
    public static int sum(int... a){
        System.out.println(a);
        int s = 0;
//        return 0;
        for (int i: a
             ) {
            s += i;
        }
        return s;
    }
}
