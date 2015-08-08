package com.company;

import java.nio.charset.Charset;

/**
 * Created by MrHu on 2015/8/6.
 */
public class KthLargestElementinanArray {
    public int partition(int []nums, int start, int end){
        int key = start;
        while (start <= end){
            while ((start <= end) && (nums[start] >= nums[key])) start++;
            while ((start <= end) && (nums[end] < nums[key])) end--;

            if (start > end) break;

            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
        }
        int tmp = nums[key];
        nums[key] = nums[end];
        nums[end] = tmp;
        return end;
    }

    public int findKthLargest(int[] nums, int k) {
        int start = 0, end = nums.length - 1;
        int mid = partition(nums, start, end);
        k = k - 1;
        while (mid != k){
            if (mid > k){
                end = mid - 1;
                mid = partition(nums, start, end);
            }else {
                start = mid + 1;
                mid = partition(nums, start, end);
            }
        }
        return nums[mid];
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(Charset.defaultCharset());
    }
}
