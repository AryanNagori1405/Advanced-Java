package com.aryan.LinkedList.Questions;

class ReOrderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode midNode = findMiddleNode(head);
        ListNode secondHead = reverseList(midNode.next); // Reverse from midNode.next
        midNode.next = null; // Split the list into two parts

        ListNode firstHead = head;

        // Merge the two halves
        while (firstHead != null && secondHead != null) {
            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;

            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
        }
    }

//    public void reorderList(ListNode head) {
//        if (head == null || head.next == null) {
//            return;
//        }
//
//        ListNode midNode = findMiddleNode(head);
//        ListNode firstHead = head;
//        ListNode secondHead = reverseList(midNode);
//
//        while (firstHead != null && secondHead != null) {
//            ListNode temp = firstHead.next;
//            firstHead.next = secondHead;
//            firstHead = temp;
//
//            temp = secondHead.next;
//            secondHead.next = firstHead;
//            secondHead = temp;
//        }
//
//        if (firstHead != null) {
//            firstHead.next = null;
//        }
//    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    private ListNode findMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the code
    public static void main(String[] args) {
        // Create a sample linked list: 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        ReOrderList solution = new ReOrderList();
        solution.reorderList(head);

        System.out.println("Reordered list:");
        printList(head);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}