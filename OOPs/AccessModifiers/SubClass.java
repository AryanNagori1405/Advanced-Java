package com.aryan.OOPs.AccessModifiers;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10, "Aryan");
        int a = obj.num;

        System.out.println(obj instanceof A);
    }
}