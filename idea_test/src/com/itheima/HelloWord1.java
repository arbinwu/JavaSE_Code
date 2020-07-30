package com.itheima;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class HelloWord1 {
    public static void main(String[] args) {
//        System.out.println("HelloWolrd");
        int[] arr = {11, 22, 33};
//        printAll(arr);
        Phone p = new Phone();
        p.call();
    }


    public static void printAll(int[] arr) {
        for (int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println();
    }
}

