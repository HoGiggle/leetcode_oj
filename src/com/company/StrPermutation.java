package com.company;

/**
 * Created by MrHu on 2015/7/23.
 */
public class StrPermutation {
    public void swap(char []s, int from, int to){
        char tmp;
        tmp = s[from];
        s[from] = s[to];
        s[to] = tmp;
    }

    public void permutation(char []s, int from, int to){
        if (from == to){
            System.out.println(s);
            return;
        }

        for (int i = from; i <= to; i++){
            swap(s, from, i);
            permutation(s, from + 1, to);
            swap(s, from, i);
        }
    }

    public static void main(String[] args) {
        char []s = {'1','2','3','4'};
        StrPermutation p = new StrPermutation();
        p.permutation(s, 0, 3);
    }
}
