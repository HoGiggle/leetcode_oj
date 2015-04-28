package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jjhu on 2015/4/28.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        if (n <= 0) return false;

        Set<Integer> res = new HashSet<Integer>();
        while (n != 1){
            if (res.contains(n)){
                return false;
            }else {
                res.add(n);

                int sum = 0;
                while (n != 0){
                    sum += Math.pow(n % 10, 2);
                    n /= 10;
                }
                n = sum;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HappyNumber h = new HappyNumber();
        System.out.println(h.isHappy(11));
    }
}
