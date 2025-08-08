package com.aryan.OOPs.Singleton;

import com.aryan.OOPs.AccessModifiers.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10, "Aryan");

        int a = obj.num;
    }
}

class SubSubClass extends SubClass {

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(10, "Aryan");
        int n = obj.num;
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(10, "Aryan");

        int a = obj.num;
    }
}
