package com.company;

/**
 * Created by jjhu on 2015/1/15.
 */
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            sb.insert(0, (char)('A' + --n % 26));
            n /= 26;
        }
        return sb.toString();
    }
}
