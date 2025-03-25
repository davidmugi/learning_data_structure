package org.example.arrays_leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    //nums = [2,7,11,15], target = 9
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer diffInTarget = target - nums[i];
            if (map.containsKey(diffInTarget)) {
                return new int[]{map.get(diffInTarget), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{0, 0};
    }
}
