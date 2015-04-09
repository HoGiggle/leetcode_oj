package com.company;

/**
 * Created by jjhu on 2015/2/3.
 */

//状态转移方程profit[i] = max(prices[i] - min(prices[0]…prices[i-1]), profit[i-1])
public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int profit = 0;
        int sum;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++){
            sum = prices[i] - buy;
            if (sum > profit)
                profit = sum;
            if (prices[i] < buy)
                buy = prices[i];
        }
        return profit;
    }//Find Minimum in Rotated Sorted Array
}
