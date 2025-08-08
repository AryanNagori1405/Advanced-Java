package com.aryan.OOPs.Inheritance;

// Multiple and Hybrid inheritance is not supported by Java,
// but these types of inheritance can be achieved using "INTERFACES".

public class Main {

    public static void main(String[] args) {

//        Box box1 = new Box(5);
//        Box box2 = new Box();
//        Box box3 = new Box(3, 4, 8);
//        Box box4 = new Box(box3);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

//        BoxWeight box5 = new BoxWeight();
//        BoxWeight box6 = new BoxWeight(5,6,7,8);
//        System.out.println(box6.h + " " + box6.weight);
//        System.out.println(box6.l); // this will throw an error bcz the 'l' variable is private in Box class

//        Box box7 = new BoxWeight(2,3,4,5);
//        System.out.println(box7.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the reference type i.e., BoxWeight
        // hence, you should have access to weight variable
        // this also means that the ones you are trying to access should be initialized
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box8 = new Box(2,3,4);
//        System.out.println(box8.weight);

//        BoxWeight box8 = new BoxWeight(box5);
//        System.out.println(box8.weight);

//        BoxPrice boxPrice = new BoxPrice(5, 8, 200);

        Box.greeting();

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting(); // you can inherit, but you cannot override
    }
}