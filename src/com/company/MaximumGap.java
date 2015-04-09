package com.company;

/**
 * Created by jjhu on 2015/1/13.
 */
public class MaximumGap {
    public static void radixSort(int []a){//基数排序
        int max = 0;
        int leng = a.length;
        for (int i : a){
            max = Math.max(max, i);
        }

        int digits = 0;
        while (max > 0){
            max /= 10;
            digits++;
        }

        for (int i = 0; i < digits; i++){
            int [][]bucket = new int[10][leng];
            int []order = new int[10];

            for (int j = 0; j < leng; j++){
                int digitNum = (a[j] % (int)Math.pow(10, i+1)) / (int)Math.pow(10, i);
                bucket[digitNum][order[digitNum]] = a[j];
                order[digitNum]++;
            }

            int count = 0;
            for (int k = 0; k < 10; k++){
                for (int m = 0; m < order[k]; m++)
                    a[count++] = bucket[k][m];
            }
        }
    }

    public static int maximumGap(int[] num) {
        if (num == null || num.length < 2)
            return 0;

        radixSort(num);
        int maxGap = 0;
        for (int i = 0; i < num.length - 1; i++){
            int j = i + 1;
            int gap = num[j] - num[i];
            if (gap > maxGap)
                maxGap = gap;
        }
        return maxGap;
    }
}
