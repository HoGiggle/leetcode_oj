package com.company;

/**
 * Created by jjhu on 2015/1/14.
 */
public class Candy {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0 )
            return 0;
        if (ratings.length <= 1)
            return 1;
        int length = ratings.length;
        int []num = new int[length];

        for (int i = 1; i < length; i++){
            if (ratings[i] > ratings[i - 1])
                num[i] = num[i - 1] + 1;
        }
        for (int i = length - 1; i > 0; i--){
            if (ratings[i - 1] > ratings[i])
                num[i - 1]  = Math.max(num[i] + 1, num[i - 1]);
        }

        int result = 0;
        for (int i = 0; i < length; i++)
            result += num[i];

        return result + length;
    }
}
