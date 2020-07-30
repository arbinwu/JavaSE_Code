package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("ui");
        array.add("oioiu");
        array.add("dausi");

        for (String s : array) {
            System.out.println(s);
        }

    }

}
