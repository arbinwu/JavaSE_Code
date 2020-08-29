package myTCP.test01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    客户端发送数据，接收服务器反馈
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.2", 10086);

        OutputStream outputStream = s.getOutputStream();
        outputStream.write("hello TCP".getBytes());

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        System.out.println("客户端接收反馈：" + new String(bys, 0, is.read(bys)));

        s.close();
    }
}
