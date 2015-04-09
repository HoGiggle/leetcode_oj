package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjhu on 2015/4/3.
 */
public class PascalTriangle2 {
    public int reduce(int a, int b){
        int absA = Math.max(Math.abs(a), Math.abs(b));
        int absB = Math.min(Math.abs(a), Math.abs(b));

        int mod = absA % absB;
        while (mod != 0){
            absA = absB;
            absB = mod;
            mod = absA % absB;
        }
        return absB;
    }

    public int combine(int x, int n){
        if (x < 0 || n < 0 || x > n)
            return 0;
        if (x > (n / 2))
            x = n - x;
        if (x == 0)
            return 1;

        int cn = 1, cx = 1;
        for (int i = x; i >= 1; i--, n--){
            cn *= n;
            cx *= i;

            int mod = reduce(cn, cx);
            cn /= mod;
            cx /= mod;
        }
        return cn / cx;
    }

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0)
            return null;

        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; i++){
            res.add(combine(i, rowIndex));
        }
        return res;
    }

    public static void main(String[] args) {
        PascalTriangle2 p = new PascalTriangle2();
        for (int i : p.getRow(18)){
            System.out.print(Integer.toString(i) + '\t');
        }
    }
}
