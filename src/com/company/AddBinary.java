package com.company;

/**
 * Created by jjhu on 2015/4/28.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        char []aChars = a.toCharArray();
        char []bChars = b.toCharArray();
        int len = Math.min(a.length(), b.length());
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = len - 1; i >= 0; i++){
            int remainder = ((aChars[i] - '0') + (bChars[i] - '0') + carry) % 2;
            carry = ((aChars[i] - '0') + (bChars[i] - '0') + carry) / 2;
            sb.append(remainder);
        }
        return null;
    }
}
