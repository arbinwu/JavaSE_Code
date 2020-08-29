package myTCP.test05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        while (true) {
            Socket accept = ss.accept();
            // 为每一个客户端开启一个线程
            new Thread(new ServerThread(accept)).start();
        }

////        InputStream is = accept.getInputStream();
////        InputStreamReader isr =new InputStreamReader(is);
////        BufferedReader br = new BufferedReader(isr);
//        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("myNet\\src\\myTCP\\test05\\copy.txt"));
//        String line;
//        while ((line = br.readLine()) != null) {
////            System.out.println(line);
//            bw.write(line);
//            bw.newLine();
//            bw.flush();
//        }
//
//        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
//        bwServer.write("文件上传成功");
//        bwServer.newLine();
//        bwServer.flush();
//
//        bw.close();
//        ss.close();
    }
}
