package IO_01;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        /*
            编码
         */
        byte[] bys = s.getBytes(); //三个字节表示一个汉字 IDEA默认的字符集为UTF-8
        System.out.println(Arrays.toString(bys)); //[-28, -72, -83, -27, -101, -67]

        byte[] bys2 = s.getBytes("GBK");// 指定为GBK编码
        System.out.println(Arrays.toString(bys2)); //[-42, -48, -71, -6]

        /*
            解码
         */
        String ss = new String(bys); //IDEA默认解码为UTF-8
        System.out.println(ss);

        String ss2 = new String(bys2,"GBK");  //指定解码，需要与编码类型对应
        System.out.println(ss2);

    }
}
