package cn.varfunc.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * <p>
 * 给定一个数组，求两个和为目标值的数组元素的索引，数组中的元素不能重复利用
 */
public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
//        /* 暴力解法 */
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;


        /* HashMap解法 */
        Map<Integer, Integer> map = new HashMap<>();
        map.put(target - nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return null;

//        /* 双指针解法 */
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                map.get(nums[i]).add(i);
//            } else {
//                map.put(nums[i], new LinkedList<>());
//            }
//        }
//
//        int[] ans = new int[2];
//
//        Arrays.sort(nums);
//        int i = 0, j = nums.length - 1;
//        while (i < j) {
//            if (nums[i] + nums[j] == target) {
//                ans[0] = map.get(nums[i]).get(0);
//            }
//        }
    }
}
