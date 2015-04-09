package com.company;

/**
 * Created by jjhu on 2015/1/29.
 */
public class LargestNumber {
    public int compare(String s1, String s2){
        /*int length1 = s1.length();
        int length2 = s2.length();
        int minLength = Math.min(length1, length2);
        char []array1 = s1.toCharArray();
        char []array2 = s2.toCharArray();

        for (int i = 0; i < minLength; i++){
            if (array1[i] != array2[i])
                return array1[i] - array2[i];
        }

        if (length1 > minLength){
            int min = 1;
            while (length1 > min){
                if (array1[min] != array2[0])
                    return array1[min] - array2[0];
                min++;
            }
        }
        if (length2 > minLength){
            int min = 1;
            while (length2 > min){
                if (array2[min] != array1[0])
                    return array1[0] - array2[min];
                min++;
            }
        }

        return length2 - length1;*/

        String add1 = s1 + s2;
        String add2 = s2 + s1;

        return add1.compareTo(add2);
    }
    public String largestNumber(int[] num) {

        if (num == null || num.length == 0)
            return "";
        int length = num.length;
        String []numStr = new String[length];
        for (int i = 0; i < length; i++){
            numStr[i] = num[i] + "";
        }
        for (int i = 0; i < length - 1; i++){
            for (int j = i + 1; j < length; j++){
                if (compare(numStr[i], numStr[j]) > 0){
                    String tmp = numStr[i];
                    numStr[i] = numStr[j];
                    numStr[j] = tmp;
                }
            }
        }
        if (numStr[length - 1].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        while (length > 0)
            sb.append(numStr[--length]);

        return sb.toString();
    }

    public static void main(String[] args) {
        int []num = {3, 30, 34, 5, 9};
        System.out.println(new LargestNumber().largestNumber(num));
    }
}
