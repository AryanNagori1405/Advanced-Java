package com.aryan.OOPs.Cloning;

public class Human implements Cloneable {

    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{3,4,5,6,9,1};
    }

    // rather than using this, we use the "Cloneable" interface
//    public Human(Human other) {
//        this.name = other.name;
//        this.age = other.age;
//    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        // this is a shallow copy
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // this is a deep copy
        Human twin = (Human) super.clone(); // this is actually a shallow copy

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);

        return twin;
    }
}
