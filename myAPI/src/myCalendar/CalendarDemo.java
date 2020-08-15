package myCalendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        // 当前时间
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + " " + month + " " + date);

        //三年前
        c.add(Calendar.YEAR,-3);
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH) + 1;
        int date2 = c.get(Calendar.DATE);
        System.out.println(year2 + " " + month2 + " " + date2);

        //十年后的五天前
        c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-5);
        int year3 = c.get(Calendar.YEAR);
        int month3 = c.get(Calendar.MONTH) + 1;
        int date3 = c.get(Calendar.DATE);
        System.out.println(year3 + " " + month3 + " " + date3);

        //设置当前日历时间
        c.set(2048,11,11);
        int year4 = c.get(Calendar.YEAR);
        int month4 = c.get(Calendar.MONTH) + 1;
        int date4 = c.get(Calendar.DATE);
        System.out.println(year4 + " " + month4 + " " + date4);


    }
}
