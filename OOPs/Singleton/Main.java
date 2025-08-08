package com.aryan.OOPs.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // this all the objects will point to
        System.out.println(obj1 + "\n" + obj2 + "\n" + obj3);
    }
}
