package org.example.arrays_leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int k = 1;
        int firstPoint = 0;
        int secondPoint = 1;

        while (secondPoint < nums.length) {
            if (nums[firstPoint] == nums[secondPoint]) {
                secondPoint++;
            } else {
                nums[firstPoint + 1] = nums[secondPoint];
                firstPoint++;
                secondPoint++;
                k++;
            }
        }
        return k;
    }
}
