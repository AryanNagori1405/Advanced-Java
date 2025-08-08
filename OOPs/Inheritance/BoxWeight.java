package com.aryan.OOPs.Inheritance;

public class BoxWeight extends Box {

    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    // static method can be inherited,
    // but cannot be overridden

    // overriding depends on objects and static doesn't depend on an object,
    // hence static method cannot be overridden

//    @Override // not overriding static method of base class i.e., Box
//    static void greeting() {
//        System.out.println("Hey, I am in BoxWeight class. Greetings!");
//    }

    BoxWeight (double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {

        super(l, w, h); // call the parent class constructor
        // used to initialize values present in parent class

        this.weight = weight;
//        System.out.println(super.weight);
    }
}
