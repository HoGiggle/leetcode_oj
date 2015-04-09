package com.company;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by jjhu on 2015/4/2.
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null) return null;
        if (strs.length == 0) return "";

        String minS = '\uffff' + "";
        for (String s : strs){
            if (s != null){
                minS = minS.compareTo(s) > 0 ? s : minS;
            }
        }

        String maxPrefix = "";
        for (int i = 1; i <= minS.length(); i++){
            String prefix = minS.substring(0, i);
            for (String s : strs){
                if (s != null && !s.startsWith(prefix))
                    return maxPrefix;
            }
            maxPrefix = prefix;
        }
        return maxPrefix;
    }

    public static void main(String[] args) {
        String []s = new String[]{"a"};
        System.out.println(longestCommonPrefix(s));
    }
}
