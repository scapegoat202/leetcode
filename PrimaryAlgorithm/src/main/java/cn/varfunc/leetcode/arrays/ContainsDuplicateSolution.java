package cn.varfunc.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * 检查在一个数组中是否存在重复的元素
 */
public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
