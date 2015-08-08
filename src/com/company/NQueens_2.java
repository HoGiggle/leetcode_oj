package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by root on 6/5/15.
 */
public class NQueens_2 {
    private final Set<Integer> occupiedCols = new HashSet<Integer>();
    private final Set<Integer> occupiedDiag1s = new HashSet<Integer>();
    private final Set<Integer> occupiedDiag2s = new HashSet<Integer>();

    public boolean canPlaced(int row, int col){
        if (occupiedCols.contains(col) || occupiedDiag1s.contains(row - col) ||
                occupiedDiag2s.contains(row + col))
            return false;
        return true;
    }

    public int totalNQueens(int n) {
        int row = 0, col = 0, canPlaced = 0, count = 0;
        while (row < n){
            while (col < n){
                if (canPlaced(row, col)){
                    canPlaced = 1;
                    col = 0;
                    break;
                }
                col++;
            }

            if (canPlaced == 0){
                if (row == 0) break;
                row--;

            }
        }
        return totalNQueensHelper(0, 0, n);
    }

    private int totalNQueensHelper(int row, int count, int n) {
        for (int col = 0; col < n; col++) {
            if (occupiedCols.contains(col))
                continue;
            int diag1 = row - col;
            if (occupiedDiag1s.contains(diag1))
                continue;
            int diag2 = row + col;
            if (occupiedDiag2s.contains(diag2))
                continue;
            // we can now place a queen here
            if (row == n-1)
                count++;
            else {
                occupiedCols.add(col);
                occupiedDiag1s.add(diag1);
                occupiedDiag2s.add(diag2);
                count = totalNQueensHelper(row+1, count, n);
                // recover
                occupiedCols.remove(col);
                occupiedDiag1s.remove(diag1);
                occupiedDiag2s.remove(diag2);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NQueens_2 n = new NQueens_2();
        System.out.println(n.totalNQueens(8));
    }
}
