package com.anonymousclass;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.method(j);

        Jumpping j2 = new Dog();
        jo.method(j2);

        System.out.println("-----------");
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("cat jump");
            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("dog cat");
            }
        });
    }
}
