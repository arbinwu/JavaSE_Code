package IO_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxt {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("word");

        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\src\\IO_02\\array.txt"));
        for (String s : array) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
