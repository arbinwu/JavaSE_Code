package streamIO;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        //字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myIO\\bos.txt"));

        //写数据
        bos.write("hello\n".getBytes());
        bos.write("world\n".getBytes());

        //释放资源
        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myIO\\bos.txt"));

        //一次读一个字节数据
        /*
        int by;
        while ((by = bis.read()) != -1) {
            System.out.print((char) by);
        }
        bis.close();
         */

        //一次读取一个字节数组的数据
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys)) != -1) {
            System.out.println(new String(bys,0,len));
        }
        bis.close();
    }
}
