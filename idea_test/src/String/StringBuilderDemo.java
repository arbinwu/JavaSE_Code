package String;


public class StringBuilderDemo {
//    public static void main(String[] args) {
//        StringBuilder s = new StringBuilder("hello");
////        System.out.println(s + "word");
//        s.append(666).append("java");
////        System.out.println(s);
//
//        String s2 = s.toString();
//        System.out.println(s2);
//
//        StringBuilder s3 = new StringBuilder(s2);
//        System.out.println(s3);
//
//    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            s.append(",");
            s.append(arr[i]);
        }
        s.append("]");
        System.out.println(s);
    }

}
