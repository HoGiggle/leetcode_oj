package com.company;

/**
 * Created by jjhu on 2015/1/27.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = (digits[digits.length - 1] + 1) / 10;
        int remainder = (digits[digits.length - 1] + 1) %10;
        int key = digits.length - 1;
        while (carry == 1 && key > 0){
            digits[key] = remainder;
            carry = (digits[--key] + 1) / 10;
            remainder = (digits[--key] + 1) % 10;
        }
        if (carry == 1){
            int []digit = new int[digits.length + 1];
            digit[0] = 1;
            return digit;
        }else {
            digits[key] = remainder;
            return digits;
        }
    }
}
