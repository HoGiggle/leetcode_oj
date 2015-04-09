package com.company;


/**
 * Created by jjhu on 2015/1/16.
 */
public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {

        if (s == null || s.length() == 0)
            return 0;
        int sum = 0;
        char []chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < chars.length; i++, j--){
            sum += (chars[i] - 64) * Math.pow(26, j);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}
