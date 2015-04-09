/*
package com.company;

*/
/**
 * Created by jjhu on 2014/12/2.
 *//*

public class ReverseInteger {
    public static int reverse(int x) {
        if (x == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        int num = Math.abs(x);
        int res = 0;
        while (num != 0) {
            if (res > (Integer.MAX_VALUE - num % 10) / 10)//非常巧妙的判断了越界问题
                return x > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + num % 10;
            num /= 10;
        }
        return x > 0 ? res : -res;
    }

    public static void main(String[] args) {
        long l = 60 * 24 * 3600 * 1000l;
        System.out.println(l);
    }
}
*/
