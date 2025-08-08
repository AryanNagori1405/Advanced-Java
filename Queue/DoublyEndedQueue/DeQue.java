package com.aryan.Queue.DoublyEndedQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQue {
    public static void main(String[] args) {

        // Deque is pronounced as deq or dek

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.addFirst(20);
        deque.addLast(30);
        deque.add(40);

        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
