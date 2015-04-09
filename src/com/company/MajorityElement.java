package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jjhu on 2015/1/16.
 */
public class MajorityElement {
    public int majorityElement(int[] num) {
        Map<Integer, Integer> numTimes = new HashMap<Integer, Integer>();
        int length = num.length;
        for (int i = 0; i < length; i++){
            if (numTimes.containsKey(num[i]))
                numTimes.put(num[i],numTimes.get(num[i]) + 1);
            else
                numTimes.put(num[i],1);
        }
        for (int i = 0; i < length; i++){
            if (numTimes.get(num[i]) > length / 2)
                return num[i];
        }
        return 0;
    }
}
