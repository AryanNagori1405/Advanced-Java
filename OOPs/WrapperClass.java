package com.aryan.OOPs;

public class WrapperClass {
    public static void main(String[] args) {
//        int a = 10; // primitive
//        int b = 20;
//
//        // wrapper
//        Integer num = 45; // in this 'num' is created as an object of type 'Integer'

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        // the numbers will not be swapped bcz in Java, there is no pass by reference only pass by value

        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus += 3;

        final String name = "Aryan";
        final A aryan = new A(name);
        System.out.println(aryan.name);
        aryan.name = "Nikhil";
        System.out.println(aryan.name);

        // when a non-primitive is final, you cannot reassign it.
//        aryan = new A("new object");  // this will throw an error

        A obj;  // declaration
        for (int i = 0; i < 1000000; i++) {
            obj = new A("Random name");  // initialization
        }
    }

//    static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }

    // this won't swap bcz Integer class is a final class in Java
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("Object created");
        this.name = name;
    }

    // garbage collection
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object destroyed");
//    }
}
