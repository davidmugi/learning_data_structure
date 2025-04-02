package org.example.fastslowpointer.medium;

import org.example.fastslowpointer.easy.ListNode;

public class RearrangeLinkedList {

    public ListNode reorder(ListNode head) {
        ListNode middle = findMiddleNode(head);
        ListNode headOfSecondHalf = reverseListNode(middle);
        ListNode headOfFirstHalf = head;

        while(headOfFirstHalf != null && headOfSecondHalf != null){
            ListNode temp = headOfFirstHalf.next;
            headOfFirstHalf.next = headOfSecondHalf;
            headOfFirstHalf = temp;

            temp = headOfSecondHalf.next;
            headOfSecondHalf.next = headOfFirstHalf;
            headOfSecondHalf = temp;
        }

        if(headOfFirstHalf != null)
            headOfFirstHalf.next = null;

        return head;
    }

    private ListNode reverseListNode(ListNode head){
        ListNode prev = null;

        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    private ListNode findMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
