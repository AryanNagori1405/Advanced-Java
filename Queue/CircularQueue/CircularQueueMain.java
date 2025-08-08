package com.aryan.Queue.CircularQueue;

public class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue circularQueue = new CircularQueue(5);

        circularQueue.insert(10);
        circularQueue.insert(20);
        circularQueue.insert(30);
        circularQueue.insert(40);

        circularQueue.display();

        System.out.println(circularQueue.remove());
//        circularQueue.insert(50);

        circularQueue.display();
    }
}
