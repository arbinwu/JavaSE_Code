package myTCP.test05;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("myNet\\src\\myTCP\\test05\\copy5.txt"));
            int count = 0;
            File file = new File("myNet\\src\\myTCP\\test05\\copy" + count + ".txt");
            while (file.exists()) {
                count++;
                file = new File("myNet\\src\\myTCP\\test05\\copy" + count + ".txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            BufferedWriter bwServwe = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServwe.write("文件上传成功");
            bwServwe.newLine();
            bwServwe.flush();

            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
