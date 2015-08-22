package com.company;

/**
 * Created by MrHu on 2015/8/21.
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if (num < 1) return false;
        while ((num%5) == 0){
            num /= 5;
        }
        while ((num%3) == 0){
            num /= 3;
        }
        while ((num%2) == 0){
            num /= 2;
        }
        return (num == 1)?true:false;
    }

    public static void main(String[] args) {
        UglyNumber u = new UglyNumber();
        System.out.println(u.isUgly(14));
    }
}
