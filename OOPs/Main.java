package com.aryan.OOPs;

// class is a template

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
//        int[] numbers = new int[5];
//
//        // store 5 names
//        String[] names = new String[5];
//
//        // data of 5 students: {roll no, name, marks}
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];
//
//        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));

        // create an object
//        Student aryan; // memory is allocated during compilation time
//        // 'new' keyword is used for dynamic memory allocation
//        aryan = new Student();  // memory is allocated during run time due to new keyword

        Student aryan = new Student(20, "Aryan", 95);

//        aryan.rno = 10;
//        aryan.name = "Aryan Nagori";
//        aryan.marks = 95.95f;

//        aryan.changeName("Nikhil");
//        aryan.greeting();

//        System.out.println(aryan.rno);
//        System.out.println(aryan.name);
//        System.out.println(aryan.marks);
//
//        Student random = new Student(aryan);
//        System.out.println(random.name);
//
//        Student random2 = new Student();
//        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";
        System.out.println(two.name);
    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object, and that is 'this' keyword

    void greeting() {
        System.out.println("Hello! my name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    // constructor
    Student (Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    // constructor
    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (12, "default person", 100.0f);
        this (12, "default person", 100.0f);
    }

    // constructor
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
