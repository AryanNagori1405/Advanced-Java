package com.aryan.OOPs.Interfaces.extendDemo;

public class ImplementingBoth implements B{

    int imp = 100;

    @Override
    public void fun() {
        System.out.println("Hey, I'm in fun() of A interface called using B interface");
    }

    @Override
    public void greeting() {
        System.out.println("Hey, I'm in greeting() of B interface");
    }
}
