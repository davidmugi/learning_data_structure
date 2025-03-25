package org.example.TwoPointerMedium;

import java.util.Arrays;

public class TripletSumCloseTarget {

    public int searchTriplet(int[] arr, int targetSum) {
        Arrays.sort(arr);

        // Closest to the sum
        // if there are two that are closest choose the smaller one

        int currentSum = Integer.MAX_VALUE;
        int currentSmallestDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int rightPointer = arr.length - 1;
            int leftPointer = i + 1;


            while (leftPointer < rightPointer) {
                int sumOfAllThree = arr[i] + arr[leftPointer] + arr[rightPointer];
                int differentBtwTargetNaSum = Math.abs(targetSum - sumOfAllThree);

                if (sumOfAllThree < targetSum) {

                    if (differentBtwTargetNaSum < currentSmallestDiff) {
                        currentSmallestDiff = differentBtwTargetNaSum;
                        currentSum = sumOfAllThree;
                    } else if (differentBtwTargetNaSum == currentSmallestDiff) {
                        if (sumOfAllThree < currentSum) {
                            currentSum = sumOfAllThree;
                        }
                    }

                    leftPointer++;
                } else if (sumOfAllThree > targetSum) {

                    if (differentBtwTargetNaSum < currentSmallestDiff) {
                        currentSmallestDiff = differentBtwTargetNaSum;
                        currentSum = sumOfAllThree;
                    } else if (differentBtwTargetNaSum == currentSmallestDiff) {
                        if (sumOfAllThree < currentSum) {
                            currentSum = sumOfAllThree;
                        }
                    }

                    rightPointer--;
                } else {
                    return sumOfAllThree;
                }
            }
        }

        // TODO: Write your code here
        return currentSum;
    }
}
