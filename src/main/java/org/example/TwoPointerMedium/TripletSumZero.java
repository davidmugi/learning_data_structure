package org.example.TwoPointerMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumZero {

    public List<List<Integer>> searchTriplets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int leftPointer = i + 1;
            int rightPointer = arr.length - 1;
            int targetSum = 0 - arr[i];

            while (leftPointer < rightPointer) {
                int leftRightSum = arr[leftPointer] + arr[rightPointer];
                if (targetSum == leftRightSum) {
                    triplets.add(List.of(arr[i], arr[leftPointer], arr[rightPointer]));
                    leftPointer++;
                    rightPointer--;
                } else if (leftRightSum > targetSum) {
                    rightPointer--;
                } else if (leftRightSum < targetSum) {
                    leftPointer++;
                }
            }
        }


        // TODO: Write your code here
        return triplets;
    }
}
