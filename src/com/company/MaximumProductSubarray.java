package com.company;

/**
 * Created by jjhu on 2015/2/10.
 */

//状态转移方程max[i] = max(max[i-1], max)
public class MaximumProductSubarray {
    public int maxProduct(int[] A) {
        if (A == null || A.length == 0)
            return Integer.MIN_VALUE;
        int maxProduct = Integer.MIN_VALUE, allProduct = 1, tmp = 1;
        for (int i = 0; i < A.length; i++) {
            tmp *= A[i];
            allProduct *= A[i];
            tmp = Math.max(Math.max(tmp, allProduct), A[i]);
            if (tmp > maxProduct)
                maxProduct = tmp;
            if (tmp == 0){
                tmp = 1;
                allProduct = 1;
            }
        }
        return maxProduct;//2,-5,-2,-4,3


        /*if (A == null || A.length == 0) {
            return 0;
        }
        int max = A[0], min = A[0], result = A[0];
        for (int i = 1; i < A.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
            min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;*/
    }

    public static void main(String[] args) {
        int []a = {20, 0, -2, -21};
        MaximumProductSubarray m = new MaximumProductSubarray();
        System.out.println(m.maxProduct(a));
    }
}
