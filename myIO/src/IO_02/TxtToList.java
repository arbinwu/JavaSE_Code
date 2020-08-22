package IO_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myIO\\src\\IO_02\\array.txt"));
        ArrayList<String> array = new ArrayList<String>();

        String line;
        while ((line=br.readLine()) != null) {
            array.add(line);
        }
        br.close();

        for (String s: array
             ) {
            System.out.println(s);
        }
    }
}
