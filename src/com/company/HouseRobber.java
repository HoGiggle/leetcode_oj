package com.company;

/**
 * Created by jjhu on 2015/4/2.
 */

//状态转移方程: max(i) = max(max(i-1), max(i-2)+num[i])

public class HouseRobber {
    public int rob(int[] num) {
        if (num == null || num.length == 0)
            return 0;
        if (num.length == 1)
            return num[0];

        int bSum = Math.max(num[0], num[1]);
        int bbSum = num[0];
        for (int i = 2; i < num.length; i++){
            int tmp = Math.max(bSum, bbSum + num[i]);
            bbSum = bSum;
            bSum = tmp;
        }
        return bSum;

    }
}
