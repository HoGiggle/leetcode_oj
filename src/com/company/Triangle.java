package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MrHu on 2015/8/13.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        /*if (triangle == null || triangle.size() == 0) return 0;
        int llLength = triangle.size();
        int lLength = triangle.get(llLength-1).size();

        int []res = new int[lLength];
        for (int i = 0; i < lLength; i++){
            res[i] = triangle.get(llLength-1).get(i);
        }

        for (int i = llLength-2; i >= 0; i--){
            lLength--;
            for (int j = 0; j < lLength; j++){
                res[j] = triangle.get(i).get(j) + Math.min(res[j], res[j+1]);
            }
        }
        return res[0];*/
        if (triangle == null || triangle.size() == 0) return 0;
        for(int i = triangle.size() - 2; i >= 0; i--)
            for(int j = 0; j <= i; j++)
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        List<Integer> i = new ArrayList<Integer>();
        i.add(1);
        i.add(3);
    }
}
