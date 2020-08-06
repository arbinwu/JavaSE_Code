package com.innerclass_01;

/**
 测试类
 */
public class InnerDemo {
    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner();
        i.show();

        Outer o = new Outer();
        o.method2();
    }
}
