package org.example.TwoPointerMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupleSumTarget {

    public List<List<Integer>> searchQuadruplets(int[] arr, int target) {
        Arrays.sort(arr);

        List<List<Integer>> quadruplets = new ArrayList<>();
        // TODO: Write your code here

        for (int i = 0; i < arr.length; i++) {

            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int diffIAndTarget = target - arr[i];

            for (int j = i + 1; j < arr.length; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;

                int diffjAnddiffIAndTarget = diffIAndTarget - arr[j];

                int leftPointer = j + 1;
                int rightPointer = arr.length - 1;

                while (leftPointer < rightPointer) {
                    int sumLeftAndRight = arr[leftPointer] + arr[rightPointer];

                    if (sumLeftAndRight < diffjAnddiffIAndTarget) {
                        leftPointer++;
                    } else if (sumLeftAndRight > diffjAnddiffIAndTarget) {
                        rightPointer--;
                    } else {
                        quadruplets.add(List.of(arr[i], arr[j], arr[leftPointer], arr[rightPointer]));
                        leftPointer++;
                        rightPointer--;

                        while (leftPointer < rightPointer && arr[leftPointer] == arr[leftPointer - 1])
                            leftPointer++;
                        while (leftPointer < rightPointer && arr[rightPointer] == arr[rightPointer - 1])
                            rightPointer--;
                    }
                }

            }
        }

        return quadruplets;
    }
}
