package com.company;

/**
 * Created by jjhu on 2015/3/31.
 */
public class MaximumTest
{
    // 比较三个值并返回最大值
    public static <T extends Comparable<T>> int maximum(T x, T y, T z)
    {
        T max = x;
        if (max.compareTo(y) < 0)
            max = y;
        if (max.compareTo(z) < 0)
            max = z;
        return 0;
    }
    public static void main( String args[] )
    {
        System.out.println(maximum(1, 2, 3));

        System.out.println(maximum(6.6, 7.7, 8.8));

        System.out.println(maximum( "pear", "apple", "orange" ));
    }
}
