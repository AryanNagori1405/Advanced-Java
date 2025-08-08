package com.aryan.LinkedList;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList singlyList = new SinglyLinkedList();

        singlyList.insertFirst(10);
        singlyList.insertFirst(20);
        singlyList.insertFirst(30);
        singlyList.insertFirst(40);
//
//        singlyList.insertLast(60);
//        singlyList.insertLast(90);
//
//        singlyList.insertAtAnyIndex(70, 4);
//        singlyList.insertAtAnyIndex(50, 4);
//        singlyList.display();
//
//        System.out.println("First item removed: " + singlyList.deleteFirst());
//        singlyList.display();
//
//        System.out.println("Last item removed: " + singlyList.deleteLast());
//        singlyList.display();
//
//        int index = 2;
//        System.out.println(index + " index item will be removed: " + singlyList.deleteAtAnyIndex(index));
//        singlyList.display();

        singlyList.insertRec(88, 2);
        singlyList.display();

//        DoublyLinkedList doublyList = new DoublyLinkedList();
//
//        doublyList.insertFirst(20);
//        doublyList.insertFirst(10);
//
//        doublyList.insertLast(50);
//        doublyList.insertLast(60);
//
//        doublyList.insertAfter(20, 30);
//        doublyList.insertAfter(30, 40);
//        doublyList.display();
//
//        System.out.println(doublyList.deleteFirst());
//        doublyList.display();
//
//        System.out.println(doublyList.deleteLast());
//        doublyList.display();
//
//        doublyList.deleteAtAnyIndex(30);
//        doublyList.display();

//        CircularLinkedList circularList = new CircularLinkedList();
//
//        circularList.insert(10);
//        circularList.insert(20);
//        circularList.insert(30);
//        circularList.display();
//
//        circularList.delete(30);
//        circularList.delete(20);
//
//        circularList.display();
    }
}
