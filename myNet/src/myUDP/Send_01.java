package myUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send_01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        String line;
        while (true) {
            line = sc.nextLine();
            if ("886".equals(line)) {
                break;
            }

            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.2"), 12345);

            ds.send(dp);
        }

        ds.close();

    }
}
