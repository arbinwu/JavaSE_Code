package IO_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myIO\\src\\IO_02\\names.txt"));

        ArrayList<String> arrayList = new ArrayList<String>();

        String line;
        while ((line = br.readLine()) != null) {
            arrayList.add(line);
        }
        br.close();

        Random r = new Random();
        int index = r.nextInt(arrayList.size());
        String name = arrayList.get(index);
        System.out.println(name);

    }
}
