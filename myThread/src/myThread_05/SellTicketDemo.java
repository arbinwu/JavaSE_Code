package myThread_05;

import sellTicket.SellTicket;

public class SellTicketDemo {
    public static void main(String[] args) {
        sellTicket.SellTicket st = new SellTicket();

        Thread t1 = new Thread(st, "window 1");
        Thread t2 = new Thread(st, "window 2");
        Thread t3 = new Thread(st, "window 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
