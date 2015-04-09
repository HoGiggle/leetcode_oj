package com.company;

/**
 * Created by jjhu on 2015/2/10.
 */
public class FindMinimumRotatedSortedArray {
    public int findMin(int[] num) {
        if (num == null || num.length == 0)
            return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++){
            if (num[i] < min)
                min = num[i];
        }
        return min;
    }//Maximum Product Subarray
}
