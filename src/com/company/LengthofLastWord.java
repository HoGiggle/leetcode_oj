package com.company;

/**
 * Created by jjhu on 2015/4/28.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0)
            return 0;
        String []items = s.trim().split(" ");
        return items[items.length - 1].length();
    }
}
