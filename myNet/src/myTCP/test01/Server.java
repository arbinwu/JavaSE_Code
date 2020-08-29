package myTCP.test01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
    服务器接收数据，给客户端反馈
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(10086);

        Socket accept = s.accept();

        InputStream is = accept.getInputStream();
        byte[] bys = new byte[1024];
        System.out.println("服务器接收：" + new String(bys, 0, is.read(bys)));

        OutputStream os = accept.getOutputStream();
        os.write("数据已收到".getBytes());

        s.close();
    }
}
