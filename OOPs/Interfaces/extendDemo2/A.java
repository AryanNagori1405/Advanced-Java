package com.aryan.OOPs.Interfaces.extendDemo2;

public interface A {

    // static interface method should always have a body
    // call via interface name
    static void greeting() {
        System.out.println("Hey, I am in static method");
    }

    default void fun() {
        System.out.println("Hey, I am in default method and I am in A interface");
    }
}
