package com.company;

/**
 * Created by root on 6/10/15.
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int max = 0;
        int [][]res = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                res[i][j] = (matrix[i][j] - '0');
//                res[i][j] = (matrix[i][j] == '0' ? 0 : 1);

                if (matrix[i][j]!='0' && (i-1)>=0 && (j-1)>=0){
                    res[i][j] = res[i][j] + Math.min(Math.min(res[i-1][j], res[i-1][j-1]),
                            res[i][j-1]);
                }
                if (res[i][j] > max) max = res[i][j];
            }
        }
        return max*max;
    }

    public static void main(String[] args) {
        char [][]in = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        MaximalSquare m = new MaximalSquare();
        System.out.println(m.maximalSquare(in));
    }
}
