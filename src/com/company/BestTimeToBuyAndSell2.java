package com.company;

/**
 * Created by jjhu on 2015/2/4.
 */

//状态转移方程profit[i] = profit[i-1] + max(A[i] - A[i-1], 0)
public class BestTimeToBuyAndSell2 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++){
           if (prices[i] > buy){
               profit += (prices[i] - buy);
               buy = prices[i];
           }else
               buy = prices[i];
        }
        return profit;
    }

    public static void main(String[] args) {
        int []p = {2, 13, 7, 5, 8};
        System.out.println(maxProfit(p));
    }
}
