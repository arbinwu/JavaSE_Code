package myTCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);

        Socket accept = ss.accept();

        InputStream is = accept.getInputStream();
        byte[] bys = new byte[1024];

        System.out.println(new String(bys, 0, is.read(bys)));

        accept.close();
        ss.close();
    }
}
