package com.aryan.OOPs.Interfaces;

public class Main {
    public static void main(String[] args) {

//        Engine car = new Car();
//        car.a;
//        car.start();
//        car.acc();
//        car.stop();

//        Media carMedia = new Car();
//        carMedia.start();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();

        car.upgradeEngine();
        car.start();

    }
}
