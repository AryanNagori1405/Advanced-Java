package com.aryan.LinkedList;

public class DoublyLinkedList {

    private Node head;

    public void insertFirst(int value) {
        Node node = new Node(value);

        node.next = head;
        node.previous = null;

        if (head != null) {
            head.previous = node;
        }
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        node.next = null;

        if (head == null) {
            node.previous = null;
            head = node;
            return;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.previous = last;
    }

    public void insertAfter(int after, int value) {
        Node node = new Node(value);
        Node prevNode = find(after);

        if (prevNode == null) {
            System.out.println("Does not exist");
            return;
        }

        node.next = prevNode.next;
        node.previous = prevNode;

        if (prevNode.next != null) {
            prevNode.next.previous = node;
        }

        prevNode.next = node;

//        node.next = prevNode.next;
//        prevNode.next = node;
//        node.previous = prevNode;
//        if (node.next != null) {
//            node.next.previous = node;
//        }
    }

    public int deleteFirst() {
        int value = head.value;
        if (head.next == null) {
            head = null;
            return value;
        }
        head.next.previous = null;
        head = head.next;

        return value;
    }

    public int deleteLast() {
        Node temp = head;
        int value;

        if (head.next == null) {
            value = head.value;
            head = null;
            return value;
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        value = temp.value;
        temp.previous = null;

        return value;
    }

    public int deleteAtAnyIndex(int value) {
        Node temp = head;
        if (head.value == value) {
            return deleteFirst();
        }

        if (temp.next == null) {
            return deleteLast();
        }

        if (temp.next.value != value) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.next.previous = temp;

        return value;
    }

    private Node find(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    public void display() {
        Node temp = head;
        Node last = null;

        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("NULL");

//        System.out.println("Print in reverse: ");
//        while (last != null) {
//            System.out.print(last.value + " <-> ");
//            last = last.previous;
//        }
//        System.out.println("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
