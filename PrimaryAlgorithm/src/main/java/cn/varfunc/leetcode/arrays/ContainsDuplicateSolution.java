package cn.varfunc.leetcode.arrays;

import java.util.Arrays;

/**
 * 检查在一个数组中是否存在重复的元素
 */
public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        final int length = nums.length;
        if (length > 1) {
            Arrays.sort(nums);
            for (int i = 1; i < length; i++) {
                if (nums[i] == nums[i - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
