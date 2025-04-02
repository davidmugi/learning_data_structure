package org.example.fastslowpointer.medium;

import org.example.fastslowpointer.easy.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
       ListNode middleListNode = findMiddleNode(head);
       ListNode reversedBackHalf = reverseListNode(middleListNode);
       ListNode copyOfReversedBackHalf = reversedBackHalf;

       while (head != null && reversedBackHalf != null){
           if(head.val != reversedBackHalf.val){
               break;
           }
           head = head.next;
           reversedBackHalf = reversedBackHalf.next;
       }

        reverseListNode(copyOfReversedBackHalf);
        return head == null || reversedBackHalf == null;
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

            if (fast == slow){
                return slow;
            }
        }

        return slow;
    }
}
