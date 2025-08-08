package com.aryan.LinkedList.Questions;

class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newNode = new ListNode();

        int carry = 0;
        int sum = 0;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;

            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }

            l1 = l1.next;
            l2 = l2.next;
            newNode.val = sum;
            newNode = newNode.next;
        }

        while (l1 != null) {
            sum = l1.val + carry;

            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }

            newNode.val = sum;
            newNode = newNode.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = l2.val + carry;

            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }

            newNode.val = sum;
            newNode = newNode.next;
            l2 = l2.next;
        }

        return newNode;
    }

    public static class ListNode {
        public ListNode head;
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}