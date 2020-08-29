package myTCP.test04;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.2", 10086);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br = new BufferedReader(new FileReader("myNet\\src\\myTCP\\test04\\s.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        s.close();

    }
}
