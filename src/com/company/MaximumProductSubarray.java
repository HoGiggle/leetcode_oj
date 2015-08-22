package com.company;

/**
 * Created by jjhu on 2015/2/10.
 */

//状态转移方程max[i] = max(max[i-1], max)
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        /*if (nums == null || nums.length == 0)
            return Integer.MIN_VALUE;
        int maxProduct = Integer.MIN_VALUE, allProduct = 1, tmp = 1;
        for (int i = 0; i < nums.length; i++) {
            tmp *= nums[i];
            allProduct *= nums[i];
            tmp = Math.max(Math.max(tmp, allProduct), nums[i]);
            if (tmp > maxProduct)
                maxProduct = tmp;
            if (tmp == 0){
                tmp = 1;
                allProduct = 1;
            }
        }
        return maxProduct;//2,-5,-2,-4,3*/


        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0], min = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []a = {20, 0, -2, -21};
        MaximumProductSubarray m = new MaximumProductSubarray();
        System.out.println(m.maxProduct(a));
    }
}
