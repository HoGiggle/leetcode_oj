package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by MrHu on 2015/8/16.
 */
public class SlidingWindowMaximum {
    public void push(Deque<Integer> deque, int []nums, int i){
        while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
            deque.pollLast();
        }
        deque.addLast(i);
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return nums;
        Deque<Integer> deque = new ArrayDeque();
        int []res = new int[nums.length - k + 1];
        for (int i = 0; i < k - 1; i++){
            push(deque, nums, i);
        }

        for (int i = k - 1; i < nums.length; i++){
            push(deque, nums, i);
            res[i - k + 1] = nums[deque.peekFirst()];
            if (i - deque.peekFirst() >= k - 1){
                deque.pollFirst();
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int []nums = {7,2,4};
        SlidingWindowMaximum s = new SlidingWindowMaximum();
        for (int i : s.maxSlidingWindow(nums, 2))
            System.out.println(i);
    }
}
