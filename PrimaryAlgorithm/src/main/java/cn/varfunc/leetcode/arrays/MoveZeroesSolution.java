package cn.varfunc.leetcode.arrays;

public class MoveZeroesSolution {
    public void moveZeroes(int[] nums) {
//        /* 比较麻烦的写法 */
//        int numberOfZeroes = 0;
//        for (int num : nums) {
//            if (num == 0) {
//                numberOfZeroes++;
//            }
//        }
//
//        for (int i = 0; i < numberOfZeroes; i++) {
//            for (int j = nums.length - 1 - i; j >= 0; j--) {
//                if (nums[j] == 0) {
//                    for (int k = j; k < nums.length - 1 - i; k++) {
//                        int tmp = nums[k];
//                        nums[k] = nums[k + 1];
//                        nums[k + 1] = tmp;
//                    }
//                }
//            }
//        }


        /* 其他大神高度优化的写法 */
        if (nums == null || nums.length < 2) {
            return;
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
