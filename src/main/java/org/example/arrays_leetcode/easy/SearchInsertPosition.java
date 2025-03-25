package org.example.arrays_leetcode.easy;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        if (target > nums[nums.length - 1])
            return nums.length;

        if (target < nums[0])
            return 0;

        for (int i = 0; i < nums.length; i++) {
            int nextValue = i + 1;
            if (nums[i] == target) {
                return i;
            } else if (nums[nextValue] > target) {
                return nextValue;
            }
        }
        return 0;
    }
}
