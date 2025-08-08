package com.aryan.LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void delete(int value) {
        Node temp = head;

        if (temp == null) {
            return;
        }

        if (temp.value == value) {
            tail = head.next;
            head = head.next;
            // OR
            // head = head.next;
            // tail.next = head;
            return;
        }

        do {
            if (temp.next.value == value) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("HEAD");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
