package com.company;

import javax.sound.midi.Soundbank;

/**
 * Created by jjhu on 2015/4/2.
 */
public class PalindromeNumber {
    public int getLength(int x){
        if (x == 0)
            return 1;
        int n = 0;
        while (x != 0){
            n++;
            x /= 10;
        }
        return n;
    }
    public boolean isPalindrome(int x) {

        if (x < 0)
            return false;
        int s = 1;
        int e = getLength(x);
        while (s < e){
            if ((int)((x % Math.pow(10, s))/Math.pow(10, s-1)) != (int)((x % Math.pow(10, e))/Math.pow(10, e-1))){
                return false;
            }
            s++;
            e--;
        }
        return true;


        /*if (x < 0) return false;

        int p = x;
        int q = 0;

        while (p >= 10){
            q *=10;
            q += p%10;
            p /=10;
        }

        return q == x / 10 && p == x % 10;*/
    }

    public static void main(String[] args) {
        int x = 100001, y = 1010;
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(x));
        System.out.println(p.isPalindrome(y));
    }
}
