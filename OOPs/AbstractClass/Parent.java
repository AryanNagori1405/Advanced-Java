package com.aryan.OOPs.AbstractClass;

public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 696969;
    }

    static void hello() {
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

//    abstract Parent(); // abstract constructor are not allowed

    abstract void career ();
    abstract void partner ();
}
