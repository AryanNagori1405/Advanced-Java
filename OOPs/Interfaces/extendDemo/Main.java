package com.aryan.OOPs.Interfaces.extendDemo;

public class Main {
    public static void main(String[] args) {
        ImplementingBoth obj = new ImplementingBoth();
        obj.fun();
        obj.greeting();

        System.out.println(A.a);
        System.out.println(B.b);
        System.out.println(obj.imp);

    }
}
