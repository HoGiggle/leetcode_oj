package com.company;

/**
 * Created by MrHu on 2015/7/30.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++){
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
                return i;
        }

        return nums[0] > nums[nums.length - 1]?nums[0] : nums[nums.length - 1];
    }
}
