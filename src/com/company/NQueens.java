package intel.bigdata.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 6/4/15.
 */
public class NQueens {

    public String[] print(int a[]){
        String []res = new String[a.length];
        for (int i = 0; i < a.length; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < a.length; j++){
                if (j + 1 == a[i]){
                    sb.append("Q");
                }else {
                    sb.append(".");
                }
            }
            res[i] = sb.toString();
        }
        return res;
    }

    public boolean canPlace(int a[], int row, int col){
        for (int i = 0; i < row; i++){
            if (a[i] == col || Math.abs(a[i] - col) == Math.abs(i - row))//判断列，斜线条件
                return false;
        }
        return true;
    }

    public List<String[]> solveNQueens(int n) {
        if (n == 1){
            String []strs = {"Q"};
            List<String[]> res = new ArrayList<String[]>();
            res.add(strs);
            return res;
        }

        List<String []> res = new ArrayList<String[]>();
        int []a = new int[n];
        int row = 0, col = 1;
         while (row < n){
            while (col < n + 1){     //判断当前行是否有满足位置
                if (canPlace(a, row, col)){//当前位置可以放置皇后
                    a[row] = col;     //设置位置
                    col = 1;          //列数重置
                    break;
                }
                col++;
            }

            if (a[row] == 0){        //当前行没有合适位置，进入上一行的下一列，继续寻找
                if (row == 0){
                    break;           //终止条件
                }
                --row;
                col = a[row] + 1;
                a[row] = 0;
            }else if (row == n - 1){ //如果当前行为最后一行，输出；当前行位置置0，转到上一行的下一列继续判断
                res.add(print(a));
                a[row] = 0;
                --row;
                col = a[row] + 1;
                a[row] = 0;
            }else {                  //当前行位置满足，进入下一行
                row++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NQueens n = new NQueens();
        int i = 0;
        for (String []strs : n.solveNQueens(8)){
            for (String s : strs){
                System.out.println(s);
            }
            i++;
            System.out.println("*****************************");
        }
        System.out.println(i);
    }
}
