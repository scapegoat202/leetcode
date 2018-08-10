package cn.varfunc.leetcode.arrays;

/**
 * 两数之和
 * <p>
 * 给定一个数组，求两个和为目标值的数组元素的索引，数组中的元素不能重复利用
 */
public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
