package mynet_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("DESKTOP-N2IFS8L");
        InetAddress address = InetAddress.getByName("192.168.1.2");
        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println(address);
        System.out.println(name);
        System.out.println(ip);
    }
}
