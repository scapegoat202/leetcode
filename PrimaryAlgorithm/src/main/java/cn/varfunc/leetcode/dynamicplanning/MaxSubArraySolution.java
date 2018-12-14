package cn.varfunc.leetcode.dynamicplanning;

import java.util.Objects;

/**
 * 最大子序和
 * <p>
 * 找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 */
public class MaxSubArraySolution {
    /* 暴力穷举 */
    public int maxSubArray(int[] nums) {
        /* result 数组保存到该位置截至的最大子数组的和 */
        int[] results = new int[nums.length];
        System.arraycopy(nums, 0, results, 0, nums.length);
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < i; j++) {
                int sum = 0;
                for (int k = j; k <= i; k++) {
                    sum += nums[k];
                }
                results[i] = Math.max(sum, results[i]);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int result : results) {
            max = Math.max(result, max);
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        Objects.requireNonNull(nums);
        /* 最大子序和 */
        int maxSoFar = nums[0];
        /* 到上一个位置为止的最大子序和 */
        int maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
}
