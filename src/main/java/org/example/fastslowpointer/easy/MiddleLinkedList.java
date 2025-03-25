package org.example.fastslowpointer.easy;

public class MiddleLinkedList {

    public ListNode findMiddle(ListNode head) {
        // TODO: Write your code here
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null){

            if(fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            } else {
                return slow;
            }
        }

        return slow;
    }
}
