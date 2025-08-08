package com.aryan.OOPs.AccessModifiers;

public class Main {

    public static void main (String[] args) {

        A obj = new A (10, "Aryan");

        // need to do a few things
        // 1. access the data members
        // 2.modify the data members

//        obj.setNum(10);
        System.out.println(obj.getNum());

        int a = obj.num;

    }
}
