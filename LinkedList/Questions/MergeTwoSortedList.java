package com.aryan.LinkedList.Questions;

import com.aryan.LinkedList.SinglyLinkedList;

class MergeTwoSortedList {

    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {

        // case: if any one of the lists is empty,
        // return the other list
        if (list1 == null) {
            return list2;
        }
        
        if (list2 == null) {
            return list1;
        }

        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {            
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        tail.next = (list1 != null) ? list1 : list2;

        // returning next bcz first node is 'null'
        return dummyHead.next;
    }

//    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
//
//        ListNode head1 = list1.head;
//        ListNode head2 = list2.head;
//
//        ListNode node = new ListNode();
//
//        while (head1 != null && head2 != null) {
//            if (head1.val < head2.val) {
//                node.insertLast(head1.val);
//                head1 = head1.next;
//            } else {
//                node.insertLast(head2.val);
//                head2 = head2.next;
//            }
//        }
//
//        while (head1 != null) {
//            node.insertLast(head1.val);
//            head1 = head1.next;
//        }
//
//        while (head2 != null) {
//            node.insertLast(head2.val);
//            head2 = head2.next;
//        }
//
//        return node;
//    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode head;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}