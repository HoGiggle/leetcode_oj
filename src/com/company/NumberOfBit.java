package com.company;

/**
 * Created by jjhu on 2015/3/30.
 */
public class NumberOfBit {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0){
            res++;
            n = n & (n - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        NumberOfBit n = new NumberOfBit();
        System.out.println(n.hammingWeight(11));
    }
}
