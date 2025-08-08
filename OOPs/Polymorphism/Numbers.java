package com.aryan.OOPs.Polymorphism;

// Compile-time Polymorphism / Static Polymorphism
// METHOD OR FUNCTION OVERLOADING

public class Numbers {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(10,20);
//        obj.sum(10,20,30);
//        obj.sum(10.00f, 20.00f);
    }
}
