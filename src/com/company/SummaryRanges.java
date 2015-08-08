package com.company;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MrHu on 2015/7/21.
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null) return null;
        int i, j;
        List<String> res = new ArrayList<String>();
        for (i = 0, j = 0; j < nums.length; j++){
            if (nums[j] > nums[i] + j - i){
                if (j - i > 1){
                    StringBuilder sb = new StringBuilder();
                    sb.append(nums[i]);
                    sb.append("->");
                    sb.append(nums[j - 1]);
                    res.add(sb.toString());
                }else {
                    res.add(nums[i] + "");
                }
                if (j == nums.length - 1){
                    res.add(nums[j] + "");
                }
                i = j;
            }else if (j == nums.length - 1){
                if (j - i > 0){
                    StringBuilder sb = new StringBuilder();
                    sb.append(nums[i]);
                    sb.append("->");
                    sb.append(nums[j]);
                    res.add(sb.toString());
                }else {
                    res.add(nums[i] + "");
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SummaryRanges s = new SummaryRanges();
        int []nums = {-2147483648,-2147483647,2147483647};
        for (String str : s.summaryRanges(nums)){
            System.out.println(str);
        }
    }
}
