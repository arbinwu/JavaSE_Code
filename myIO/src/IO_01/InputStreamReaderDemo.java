package IO_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myIO\\osw.txt"));

        //一次读一个数据
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char)ch);
//        }

        //一次读一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            System.out.println(new String(chs,0,len));
        }
        //释放资源
        isr.close();
    }
}
