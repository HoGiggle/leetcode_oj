package com.company;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jjhu on 2015/3/30.
 */
public class StringToInteger{
    public int atoi(String str) {
        /**
         * 1、str为空
         * 2、str包含非0-9字符
         * 3、str表示数超过int范围
         */

        Pattern p = Pattern.compile("^([+-]?\\d+).*$");
        Matcher m = p.matcher(str.trim());
        if (m.find()){
            System.out.println(m.group(1));
            BigInteger big = new BigInteger(m.group(1));
            if (big.signum() > 0 && big.subtract(new BigInteger(String.valueOf(Integer.MAX_VALUE))).signum() > 0)
                return Integer.MAX_VALUE;
            if (big.signum() < 0 && big.subtract(new BigInteger(Integer.MIN_VALUE + "")).signum() < 0)
                return Integer.MIN_VALUE;
            return big.intValue();
        }
        return 0;
    }

    public static void main(String[] args) {
        StringToInteger s = new StringToInteger();
        System.out.println(s.atoi(""));
    }
}
