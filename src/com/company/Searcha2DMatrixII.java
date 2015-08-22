package com.company;

import huawei.com.Main;

/**
 * Created by MrHu on 2015/8/8.
 */
public class Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int row = matrix.length, col = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[row - 1][col - 1])
            return false;

        int k = 0;
        while (k < row && k < col && matrix[k][k] < target) k++;
        if (k < row && k < col && matrix[k][k] == target) return true;
        for (int i = k; i < row; i++){
            if (target < matrix[i][0]) break;
            for (int j = 0; j < k; j++){
                if (matrix[i][j] == target) return true;
            }
        }
        for (int j = k; j < col; j++){
            if (target < matrix[0][j]) break;
            for (int i = 0; i < k; i++){
                if (matrix[i][j] == target) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]nums = {{1,4,7,11,15},{2,5,8,12,19},
                {3,6,9,16,22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        Searcha2DMatrixII s = new Searcha2DMatrixII();
        System.out.println(s.searchMatrix(nums, 22));
    }
}
