package com.company;

import java.math.BigInteger;

/**
 * Created by MrHu on 2015/8/17.
 */
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return  nums;
        int []res = new int[nums.length];

        if (nums[0] == 0){
            int pro = 1, count = 0;
            for (int i = 1; i < nums.length; i++){
                if (nums[i] == 0){
                    count = 1;
                    break;
                }
                pro *= nums[i];
            }
            if (count == 0){
                res[0] = pro;
            }
        }else {
            int pro = 1, count = 0, pos = -1;
            for (int i = 1; i < nums.length; i++){
                if (nums[i] == 0){
                    count += 1;
                    pos = i;
                    if (count > 1){
                        break;
                    }
                    continue;
                }
                pro *= nums[i];
            }

            if (count == 1){
                res[pos] = pro * nums[0];
            }else if (count == 0){
                for (int i = 0; i < nums.length; i++){
                    res[i] = pro / nums[i] * nums[0];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        ProductofArrayExceptSelf p = new ProductofArrayExceptSelf();
        for (int i : p.productExceptSelf(nums))
            System.out.println(i);
    }
}
