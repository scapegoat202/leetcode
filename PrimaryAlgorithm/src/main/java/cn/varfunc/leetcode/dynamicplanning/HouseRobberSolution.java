package cn.varfunc.leetcode.dynamicplanning;

import static java.lang.Math.max;

/**
 * 打家劫舍
 * <p>
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 */
public class HouseRobberSolution {
//    public int rob(int[] nums) {
//        final int length = nums.length;
//        if (length == 0) {
//            return 0;
//        } else if (length == 1) {
//            return nums[0];
//        } else if (length == 2) {
//            return max(nums[0], nums[1]);
//        } else {
//            int lastLastMaxProfit = nums[0];
//            int lastMaxProfit = nums[1];
//            int currentMaxProfit = nums[2];
//            for (int i = 3; i < length; i++) {
//                /* 如果选择了抢劫上一个屋子，那么就不能抢劫当前的屋子，所以最大收益就是抢劫上一个屋子的收益 */
//                /* 如果选择抢劫当前屋子，就不能抢劫上一个屋子，所以最大收益是到上一个屋子的上一个屋子为止的最大收益，加上当前屋子里有的钱 */
//                int temp = currentMaxProfit;
//                currentMaxProfit = max(currentMaxProfit, lastMaxProfit + nums[i]);
//                lastMaxProfit = temp;
//            }
//            return currentMaxProfit;
//        }
//    }

    public int rob2(int[] nums) {
        int prePre = 0;
        int pre = 0;
        int current = 0;

        int length = nums.length;
        for (int num : nums) {
            int temp = current;
            current = num + max(pre, prePre);
            prePre = pre;
            pre = temp;
        }

        return max(current, pre);
    }
}
