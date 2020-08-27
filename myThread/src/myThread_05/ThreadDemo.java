package myThread_05;

import java.util.*;

public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();   //线程同步安全的
        StringBuilder sb2 = new StringBuilder();//线程不安全的

        Vector<String> v = new Vector<String>();  //线程同步安全的
        ArrayList<String> array = new ArrayList<String>();//线程不安全的

        Hashtable<String, String> ht = new Hashtable<String, String>(); //线程同步安全的
        HashMap<String, String> hm = new HashMap<String, String>(); //线程不安全的

        //static <T> List<T> synchronizedList(List<T> list) 返回由指定列表支持的同步（线程安全）列表
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

    }
}
