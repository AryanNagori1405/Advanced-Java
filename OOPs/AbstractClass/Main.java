package com.aryan.OOPs.AbstractClass;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(22);
        son.career();
        son.partner();
        System.out.println(son.VALUE);

        son.normal();

        Parent daughter = new Daughter(25);
        daughter.career();
        daughter.partner();

        // cannot create an object of an abstract class
//        Parent parent = new Parent(25);

        Parent.hello();

    }
}
