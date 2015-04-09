package com.company;

import sun.security.util.Length;

/**
 * Created by jjhu on 2015/4/1.
 */
public class RotateArray {

    private void reverse(int[] nums, int s, int e) {
        while (s < --e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            ++s;
        }
    }

    public void rotate(int[] nums, int k) {
        if (nums == null)
            return;
        int []tmp = nums.clone();
        int length = nums.length;
        k = k % length;

        for (int i = 0; i < nums.length; i++){
            nums[i] = tmp[(i - k + length) % length];
        }

        int n = nums.length;
        k %= n;
        reverse(nums, 0, n);
        reverse(nums, 0, k);
        reverse(nums, k, n);


        //在i处应该的值为before
/*
        if (nums == null || nums.length == 0)
            return;
        int length = nums.length;
        int i = length - 1;
//        int before = nums[i];
        int before = nums[(i - k + length) % length];
        k = k % length;
        for (int j = 0; j < length; j++){
            int tmp = nums[i];
            nums[i] = before;
            i = (i + k + length) % length;
            before = tmp;
        }*/
    }

    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7,8};
        new RotateArray().rotate(a, 5);
        for (int i : a)
            System.out.println(i);
    }
}

//[1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
//[1,2,3,4,5,6,7,8] is rotated to [7,8,1,2,3,4,5,6].
