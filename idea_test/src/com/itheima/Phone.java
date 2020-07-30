package com.itheima;

/*
手机类
一个类包括成员属性和成员方法
 */
public class Phone {
    //成员属性
    String brand;
    int price;

    //成员方法
    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }


    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();

    }
}


