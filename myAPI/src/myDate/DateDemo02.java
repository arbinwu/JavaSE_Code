package myDate;

import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());

        long time = 1000*60*60;
//        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);
    }
}
