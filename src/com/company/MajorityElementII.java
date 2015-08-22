package com.company;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by MrHu on 2015/8/18.
 */
public class MajorityElementII {
    public boolean check(int []nums, int n, int k){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == n) count++;
        }
        if (count > (nums.length / k)) return true;
        return false;
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new LinkedList<Integer>();

        if (nums == null || nums.length == 0) return res;
        int n1 = nums[0], n2 = nums[0], t1 = 1, t2 = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == n1 || nums[i] == n2){
                if (nums[i] == n1){
                    t1++;
                    continue;
                }
                t2++;
            }else {
                if (t1 > 0 && t2 > 0){
                    t1--;
                    t2--;
                }else {
                    if (t1 == 0){
                        n1 = nums[i];
                        t1 = 1;
                    }else {
                        n2 = nums[i];
                        t2 = 1;
                    }
                }
            }
        }

        System.out.println(n1);
        System.out.println(t1);
        System.out.println(n2);
        System.out.println(t2);
        if (t1 + t2 == 0){
            return res;
        }
        if (t1 > 0 && check(nums, n1, 3)) res.add(n1);
        if (t2 > 0 && check(nums, n2, 3)) res.add(n2);
        return res;
    }

    public static void main(String[] args) {
        MajorityElementII m = new MajorityElementII();
        int []nums = {1,2,1,1,1,3,3,4,3,3,3,4,4,4};
        for (int i : m.majorityElement(nums)){
            System.out.println(i);
        }
    }
}
