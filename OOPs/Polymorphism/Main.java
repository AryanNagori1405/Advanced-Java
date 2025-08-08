package com.aryan.OOPs.Polymorphism;

public class Main {

    public static void main(String[] args) {

        // if the type of ref variable is of parent class
        // but the object is of type subclass,
        // then there should be a method of the same name in both the classes
        // then it is overriding

        // syntax: Parent objVariable = new Child();
        // here which method will be called depends on 'Child()'
        // this is known as "UPCASTING"

        // this whole thing is how overriding works

        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        // if we remove the area() from parent class
        // then the below lines will throw an error,
        // so to run the area() of subclasses
        // there should be area() present in parent class also

        shape.area();
        circle.area();
        square.area();
    }
}
