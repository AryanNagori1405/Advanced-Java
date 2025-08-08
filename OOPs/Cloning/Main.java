package com.aryan.OOPs.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human aryan = new Human("Aryan", 20);
//        Human twin = new Human(aryan);

        Human twin = (Human) aryan.clone();
        System.out.println(twin.name + " " + twin.age);
        /*
            for non-primitive, it won't create a variables
            here, twin object will point to an aryan object
            if any changes made in any of the object it will affect all the object
            this is why it is called as shallow copy
        */
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(aryan.arr));
    }
}
