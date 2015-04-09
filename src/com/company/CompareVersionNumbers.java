package com.company;

/**
 * Created by jjhu on 2015/1/19.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String []item1 = version1.split("\\.");
        String []item2 = version2.split("\\.");
        int length = Math.min(item1.length, item2.length);
        for (int i = 0; i < length; i++){
            if (Integer.parseInt(item1[i]) == Integer.parseInt(item2[i]))
                continue;
            else if (Integer.parseInt(item1[i]) < Integer.parseInt(item2[i]))
                return -1;
            else
                return 1;
        }
        while (length < item1.length){
            if (Integer.parseInt(item1[length]) > 0){
                return 1;
            }
            length++;
        }

        while (length < item2.length){
            if (Integer.parseInt(item2[length]) > 0)
                return -1;
            length++;
        }

        return 0;
    }
}
