package com.aryan.OOPs.Polymorphism;

// Run-time Polymorphism / Dynamic Polymorphism
// METHOD OR FUNCTION OVERRIDING

public class Shapes {

    void area() {
        System.out.println("I am in Shapes");
    }

    // if we want to prevent overriding or inheritance,
    // we can use the 'final' keyword as shown below

    // these below lines are called as "Early Binding"

//    final void area() {
//        System.out.println("I am in Shapes");
//    }
}
