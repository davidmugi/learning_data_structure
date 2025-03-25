package org.example.twopointereasy.easy;

public class NonDuplicateNumberInstances {

    public int moveElements(int[] arr) {
        int firstPointer = 0;
        int secondPointer = 1;
        int result = 1;

        while (secondPointer < arr.length) {
            if (arr[firstPointer] != arr[secondPointer]) {
                arr[firstPointer + 1] = arr[secondPointer];
                firstPointer++;
                secondPointer++;
                result++;
            } else {
                secondPointer++;
            }
        }

        return result;
    }
}
