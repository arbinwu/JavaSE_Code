package myUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的socket对象（DatagramSocket）
        //DatagramSocket（int poet）构造数据报套接字并将其绑定到本地主机上的指定端口
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包，用于接收数据
        //DatagramPacket(byte buf[], int length) 构造一个 DatagramPacket用于接收长度为 length数据包
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        //调用DatagramSocket 对象的方法接收数据
        ds.receive(dp);

        //解析数据包，并在控制台显示
        byte[] data = dp.getData();
        int len = dp.getLength();
//        System.out.println(Arrays.toString(data));
//        System.out.println(new String(data, 0, len));
        System.out.println(new String(dp.getData(), 0, dp.getLength()));

        //关闭接收端
        ds.close();

    }
}
