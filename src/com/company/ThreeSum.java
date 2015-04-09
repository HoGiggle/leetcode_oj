package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jjhu on 2015/1/6.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] num) {
        if (num == null)
            return null;
        if (num.length == 0)
            return new ArrayList<List<Integer>>();

        /*for (int i = 1; i < num.length; i++){
            int j = i - 1;
            int temp = num[i];
            while (j >= 0 && temp < num[j]){
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = temp;
        }*/
        Arrays.sort(num);

        int a = 99999;
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for (int x = 0; x < num.length - 2; x++){
            if (num[x] == a)
                continue;
            int b = 99999;
            for (int y = x + 1; y < num.length - 1; y++){
                if (num[y] == b)
                    continue;
                for (int z = y + 1; z < num.length; z++){
                    int sum = num[x] + num[y] + num[z];
                    if (sum == 0){
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(num[x]);
                        list.add(num[y]);
                        list.add(num[z]);
                        lists.add(list);
                        a = num[x];
                        b = num[y];
                        break;
                    }
                }
            }
        }
        return lists;
    }
}
