package com.company;

/**
 * Created by MrHu on 2015/7/21.
 */
public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
//        if (n <= 0)
//            return false;
        n &= (n - 1);
        return n == 0;
    }

    public static void main(String[] args) {
        PowerofTwo p = new PowerofTwo();
        System.out.println(p.isPowerOfTwo(0));
    }
}
