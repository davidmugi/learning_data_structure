package org.example;

import org.example.FastSlowPointer.Easy.ListNode;
import org.example.FastSlowPointer.Easy.MiddleLinkedList;
import org.example.TwoPointerMedium.ComparingStringsContainingBackspaces;
import org.example.TwoPointerMedium.DutchNationalFlag;
import org.example.TwoPointerMedium.MinimumWindowSort;
import org.example.TwoPointerMedium.QuadrupleSumTarget;
import org.example.TwoPointerMedium.TripletSumCloseTarget;
import org.example.TwoPointerMedium.TripletswithSmallerSum;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.setNext(new ListNode(2));
        listNode.getNext().setNext(new ListNode(3));
        listNode.getNext().getNext().setNext(new ListNode(4));
        listNode.getNext().getNext().getNext().setNext(new ListNode(5));
        listNode.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        listNode.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        System.out.println(new MiddleLinkedList().findMiddle(listNode).getVal());
    }
}