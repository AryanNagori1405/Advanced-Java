package com.aryan.OOPs.Interfaces.extendDemo2;

public class Main implements B {

    @Override
    public void greet() {
        System.out.println("Hey, I am in greet method of B interface called via Main class");
    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.greet();
        obj.fun();
        A.greeting(); // static method should be called via Interface name or Class name
    }
}
