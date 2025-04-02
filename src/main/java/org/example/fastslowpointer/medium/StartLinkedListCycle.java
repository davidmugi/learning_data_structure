package org.example.fastslowpointer.medium;

import org.example.fastslowpointer.easy.ListNode;

import java.util.HashMap;

public class StartLinkedListCycle {

    public ListNode findCycleStart(ListNode head) {
        int length = lengthOfCycle(head);

        ListNode slow = head;
        ListNode fast = head;

        while (length > 0){
            fast = fast.getNext();
            length--;
        }

        while(slow != fast){
            slow = slow.getNext();
            fast = fast.getNext();
        }

        return slow;
    }

    public int lengthOfCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if(slow == fast){
                ListNode lengthCycle = slow;
                int length = 0;
                do {
                    lengthCycle = lengthCycle.getNext();
                    length++;
                }while (lengthCycle != slow);

                return length;
            }
        }

        return 0;
    }
}
