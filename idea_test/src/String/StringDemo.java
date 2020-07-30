package String;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nextLine = sc.nextLine();

        String s = arrayToString(nextLine);
        System.out.println(s);
    }

    public static String arrayToString(String arr) {
        String s = "";
        for (int i = arr.length() - 1; i >= 0; i--) {
            s += arr.charAt(i);
        }
        return s;
    }
}
