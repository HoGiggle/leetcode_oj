package com.company;

import java.math.BigInteger;

/**
 * Created by jjhu on 2014/12/24.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if (n <= 0)
            return null;
        if (n == 1)
            return "1";
        BigInteger big = new BigInteger("1");
        BigInteger bit = new BigInteger("10");
        BigInteger zero = new BigInteger("0");
        for (int i = 1; i < n; i++){
            BigInteger remainder;
            BigInteger temp = bit;
            StringBuilder result = new StringBuilder();
            int bitCount = 0;
            while (!big.equals(zero)){
                remainder = big.remainder(bit);
                big = big.divide(bit);
                if (remainder.intValue() == temp.intValue()){
                    bitCount++;
                }else if (bitCount > 0){
                    result.append(temp.toString());
                    result.append(bitCount);
                    temp = remainder;
                    bitCount = 1;
                }
                else {
                    bitCount++;
                    temp = remainder;
                }
            }
            result.append(temp.toString());
            result.append(bitCount);
            big = new BigInteger(result.reverse().toString());
        }
        return big.toString();
    }

    public static void main(String[] args) {
        CountAndSay ob = new CountAndSay();
        System.out.println(ob.countAndSay(10));
    }
}
