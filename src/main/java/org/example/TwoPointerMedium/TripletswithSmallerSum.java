package org.example.TwoPointerMedium;

import java.util.Arrays;

public class TripletswithSmallerSum {

    public int searchTriplets(int[] arr, int target) {
        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int leftPointer = i + 1;
            int rightPointer = arr.length - 1;

            while (leftPointer < rightPointer) {
                int sum = arr[i] + arr[leftPointer] + arr[rightPointer];

                if (sum < target) {
                    count = count + rightPointer - leftPointer;
                    leftPointer++;
                } else {
                    rightPointer--;
                }
            }
        }

        // TODO: Write your code here
        return count;
    }
}
