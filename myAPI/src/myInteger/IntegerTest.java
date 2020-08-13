package myInteger;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
//        Integer ii = Integer.valueOf("100");
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
        int[] arr = new int[strArray.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ");
            }
        }

        String result = sb.toString();
        System.out.println(result);

    }

}
