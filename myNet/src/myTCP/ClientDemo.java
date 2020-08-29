package myTCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        Socket skt = new Socket(InetAddress.getByName("192.168.1.2"), 10000);
        Socket skt = new Socket("192.168.1.2", 10001);

        //获取输出流  写数据
        OutputStream os = skt.getOutputStream();
        os.write("hello java".getBytes());

        skt.close();
    }
}
