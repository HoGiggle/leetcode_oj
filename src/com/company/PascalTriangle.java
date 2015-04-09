package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjhu on 2015/3/30.
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++){
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            if (i > 0){
                for (int j = 0; j < result.get(i - 1).size() - 1; j++){
                    list.add(result.get(i - 1).get(j) + result.get(i - 1).get(j + 1));
                }
                list.add(1);
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        PascalTriangle p = new PascalTriangle();
        List<List<Integer>> res = p.generate(10);
        for (List<Integer> list : res){
            for (int i : list)
                System.out.print(i + " ");
            System.out.println();

        }
    }
}

/*      [
        [1],
        [1,1],
        [1,2,1],
        [1,3,3,1],
        [1,4,6,4,1]
        ]*/
