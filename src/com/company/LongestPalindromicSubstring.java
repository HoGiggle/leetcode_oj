package com.company;

/**
 * Created by MrHu on 2015/8/26.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) return s;

        //exp:12212321  to @#1#2#2#1#2#3#2#1#
        //expand to 2n+2
        char []ss = new char[s.length()*2+2];
        ss[0] = '@';
        for (int i = 1; i < ss.length; i++){
            if (i % 2 == 0){
                ss[i] = s.charAt(i/2 - 1);
            }else {
                ss[i] = '#';
            }
        }

        //p[i] record the max palin length of i
        //exp:@#1#2#2#1#2#3#2#1#   i=4 p[i[=2; i=5 p[i]=5
        int []p = new int[ss.length];
        int id = 0, mx = 1, maxId = 0, maxMx = 1;
        p[0] = 1;

        for (int i = 1; i < ss.length-1; i++){
            if (mx > i){
                p[i] = Math.min(p[2*id - i], mx-i);
            }else {
                p[i] = 1;
            }

            while ((i-p[i])>=0 && (i+p[i])<ss.length && ss[i-p[i]]==ss[i+p[i]]) p[i]++;
            if ((p[i]+i) > mx){
                mx = p[i] + i;
                id = i;
            }
            if (p[i] > maxMx-maxId){
                maxId = i;
                maxMx = p[i] + i;
            }
        }
        return s.substring((2*maxId - maxMx)/2, maxMx - maxMx/2 - 1);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();

        System.out.println(l.longestPalindrome("12212321"));
        System.out.println(l.longestPalindrome("ccd"));
    }
}
