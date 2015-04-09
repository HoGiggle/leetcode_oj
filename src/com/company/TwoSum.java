package com.company;

import java.util.HashMap;

/**
 * Created by jjhu on 2015/1/7.
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){

            int diff = target - numbers[i];
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff)+1, i+1};
                return toReturn;
            }

            hash.put(numbers[i], i);
        }
        return null;
    }
}
