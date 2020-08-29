package myUDP;

import java.io.IOException;
import java.net.*;

/*
    UDP发送数据
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的socket对象（DatagramSocket）
        //DatagramSocket（）构造数据报套接字并将其绑定到本地主机上的任何可用端口
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        //DatagramPacket(byte buf[], int length,InetAddress address, int port)
        //构造一个数据包，发送长度为 length 的数据包到指定主机上的指定端口号
        byte[] bys = "hello,UDP".getBytes();
        int length = bys.length;
//        InetAddress address = InetAddress.getByName("192.168.1.2");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys, length, address, port);
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.2"), 10086);

        //调用DatagramSocket对象的方法发送数据
        ds.send(dp);
        //关闭发送端
        ds.close();

    }
}
