package com.innerclass_01;

public class Outer {
    private int num = 10;

    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
//        show()
        Inner i = new Inner();
        i.show();
    }

    private class Inner2 {
        public void show() {
            System.out.println(num);
        }
    }

    public void method2() {
        Inner i = new Inner();
        i.show();
    }

}
