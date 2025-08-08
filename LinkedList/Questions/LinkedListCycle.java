package com.aryan.LinkedList.Questions;

// Amazon and Microsoft

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public int lengthCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    ListNode temp = slow;
                    int len = 0;

                    do {
                        temp = temp.next;
                        len++;
                    } while (temp != slow);
                    // OR
//                    while (temp != fast) {
//                        temp = temp.next;
//                        len++;
//                    }
                    return len;
                }
            }
            return 0;
        }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
