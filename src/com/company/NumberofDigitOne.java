package com.company;

import java.util.Collection;
import java.util.Map;

/**
 * Created by MrHu on 2015/8/18.
 */
public class NumberofDigitOne {
    public boolean canDivide(int n, int level){
        if (n % level != 0) return false;
        return true;
    }

    /* n = 144, bit = 2, level = 100
     */
    public int helper(int n, int bit, int level){
        if (n <= 0) return 0;
        int res;
        if (canDivide(n, level)){
            if (n / level == 1){
                res = bit*(level/10) + 1;
            }else {
                res = (level + (n/level)*(level/10)*bit);
            }
            return res;
        }else {
           /* int bit1 = 0, level1 = 1, tmp = (n-(n/level)*level)/10;
            while (tmp != 0){
                bit1++;
                level1 *= 10;
                tmp /= 10;
            }
            res = helper(((n / level) * level), bit, level) + helper(n-(n/level)*level,
                    bit1, level1);*/
            res = countDigitOne(n/level*level)+ countDigitOne(n-(n/level)*level);
            if (n / level == 1){
                res += (n-level);
            }
        }
        return res;
    }

    public int countDigitOne(int n) {
        if (n <= 0) return 0;
        int bit = 0, level = 1, tmp = n/10;
        while (tmp != 0){
            bit++;
            level *= 10;
            tmp /= 10;
        }
        return helper(n, bit, level);
    }

    public static void main(String[] args) {
        NumberofDigitOne n = new NumberofDigitOne();
        System.out.println(n.countDigitOne(1410065408));
        System.out.println(Integer.MAX_VALUE);
    }
}
