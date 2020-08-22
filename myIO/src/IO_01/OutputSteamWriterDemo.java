package IO_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputSteamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myIO\\osw.txt"));

        //写一个字符,只会放在缓冲流中，需要刷新才会保存到文件
        osw.write(97);
        //刷新流
        osw.flush();

        //写入一个字符数组
        char[] chs = {'a','b','c'};
        osw.write(chs);
        //指定字符数组长度
        osw.write(chs,1,2);

        //写一个字符串
        osw.write("oop");
        //指定字符串长度
        osw.write("yyyuuu",2,2);
        //close会先刷新流，再关闭，调用close之后无法再进行写入数据
        osw.close();

    }
}
