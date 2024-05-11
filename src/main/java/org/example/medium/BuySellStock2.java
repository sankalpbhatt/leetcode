package org.example.medium;

/**
 * Top 150 Interview question
 * Problem 122: Best Time to Buy and Sell Stock II
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
 * Find and return the maximum profit you can achieve.
 */
public class BuySellStock2 {

    public static void main(String [] happy){
        int [] sample1 = {7,1,5,3,6,4}; // Pass you test sample here
        BuySellStock2 solution = new BuySellStock2();
        System.out.println("Maximum profit: "+ solution.maxProfit(sample1));
    }

    public int maxProfit(int[] prices) {

        int profit = 0;
        int buyPrice = prices[0];
        int len = prices.length;
        for(int i = 1;i<len; i++){
            if(buyPrice < prices[i]) {
                profit += prices[i] - buyPrice;
            }
            buyPrice = prices[i];
        }
        return profit;
    }

}
