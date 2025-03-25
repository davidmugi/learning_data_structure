package org.example.twopointereasy.easy;

public class TargetSum {

    public int[] search(int[] arr, int targetSum) {
        int firstPointer = 0;
        int secondPointer = arr.length - 1;


        while (firstPointer < secondPointer) {
            int sum = arr[firstPointer] + arr[secondPointer];

            if (sum > targetSum) {
                secondPointer--;
            } else if (sum < targetSum) {
                firstPointer++;
            } else {
                return new int[]{firstPointer, secondPointer};
            }
        }

        // TODO: Write your code here
        return new int[]{-1, -1};
    }
}
