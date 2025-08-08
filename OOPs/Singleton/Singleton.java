package com.aryan.OOPs.Singleton;

public class Singleton {
    private Singleton () {

    }

    static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
