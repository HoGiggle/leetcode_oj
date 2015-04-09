package com.company;

import java.util.Arrays;

/**
 * Created by jjhu on 2015/1/13.
 */
public class SumClosest {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        if (num == null || num.length < 3)
            return 0;
        int sumClosest = num[0] + num[1] + num[2];
        for (int i = 0; i < num.length - 2; i++){

            int j = i + 1;
            int k = num.length - 1;
            while (j < k){
                int sum;
                sum = num[i] + num[j] + num[k];
                if (Math.abs(sum - target) < Math.abs(sumClosest - target)){
                    sumClosest = sum;
                    if (sumClosest == target)
                        return sumClosest;
                }

                if (sum > target)
                    k--;
                else
                    j++;
            }
        }
        return sumClosest;
    }
}
