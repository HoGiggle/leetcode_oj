package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by MrHu on 2015/8/11.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        /*int fir = 0, end = height.length - 1, max = 0;
        while (fir < end){
            if (height[fir] <= height[end]){
                int i = fir;
                while ((++fir) < end && height[fir] <= height[i]){}
                max += height[i]*(fir - i);
            }else {
                int i = end;
                while ((--end) > fir && height[end] <= height[i]){}
                max += height[i]*(i - end);
            }
        }
        return max;*/

        if (height == null || height.length == 0) return 0;
        int start = 0, end = height.length - 1;
        int max = 0;
        while (start < end){
            max = Math.max(Math.min(height[start], height[end]) * (end - start), max);
            if (height[start] >= height[end]){
                int i = end--;
                while ( height[i] >= height[end] && start < end ) end--;
            }else {
                int i = start++;
                while ( height[i] >= height[start] && start < end) start++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        int []h = {3,1,2,4};
        System.out.println(c.maxArea(h));
    }
}
