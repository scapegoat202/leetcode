package cn.varfunc.leetcode.arrays;

/**
 * 只出现一次的数字
 * <p>
 * 给定一个非空数组，除了其中某个元素只出现一次外，其余元素均出现两次，求那个数字
 */
public class SingleNumberSolution {
    public int singleNumber(int[] nums) {
//        这是一开始想到的解法，麻烦
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (!(i == j)) {
//                    if (nums[i] == nums[j]) {
//                        break;
//                    }
//                    if (nums[i] != nums[j]) {
//                        count++;
//                    }
//                }
//            }
//
//            if (count == nums.length - 1) {
//                return nums[i];
//            }
//        }
//        return -1;

//      大神的解法，好巧妙，对位运算不熟悉感觉很吃亏啊
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
