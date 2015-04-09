package com.company;
/**
 * Created by jjhu on 2015/4/3.
 */
public class ReverseBits {
    public int reverseBits(int n) {
      /*  if (n == Integer.MIN_VALUE)
            return 1;

        int sign = n & 1;
        int res = 0;
        for (int i = 1; i < 32; i++){
            res *= 2;
            res += ((n >> 1) & 1);
            n = n >> 1;
        }
        return sign == 0 ? res : -res;*/

        int res = 0;
        for (int i = 0; i < 32; i++){
            res *= 2;
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        ReverseBits r = new ReverseBits();
        System.out.println(Integer.toBinaryString(r.reverseBits(3)));
        System.out.println(r.reverseBits(3));
    }
}
