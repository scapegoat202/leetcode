package cn.varfunc.leetcode.arrays;

/**
 * 股票购买的最佳时机
 * <p>
 * 给定一个数组代表每一天的股价，每次只能进行一次交易，在一次交易完成之前不能进行下一次交易，求获得的最大利润
 */
public class MaxProfitSolution {
    /**
     * 一开始想的太复杂了，解法很简单
     * 如果后一天的股价比前一天的高，就代表是有利可图的，把所有后一天股价比前一天的高的部分的差价求和就好了
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
