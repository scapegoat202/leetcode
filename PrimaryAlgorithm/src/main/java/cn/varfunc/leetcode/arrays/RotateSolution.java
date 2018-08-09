package cn.varfunc.leetcode.arrays;

import java.util.Arrays;
import java.util.function.Consumer;

public class RotateSolution {
    public void rotate(int[] nums, int k) {
//        if (nums.length == 2) {
//            if (k % 2 != 0) {
//                int tmp = nums[0];
//                nums[0] = nums[1];
//                nums[1] = tmp;
//            }
//        } else {
//            if (nums.length % 2 != 0) {
//                myRotate(nums, k, 0, nums.length);
//            } else {
//                int t = nums.length / 2;
//                myRotate(nums, k, 0, t);
//                myRotate(nums, k, 1, t);
//            }
//        }


//        // 旋转K次，每次旋转1个单位，只可惜是见复杂度是n^2
//        for (int i = 0; i < k; i++) {
//            Queue<Integer> queue = new LinkedList<>();
//            int index = 0;
//            int nextIndex = (index + 1) % nums.length;
//            queue.offer(nums[index]);
//            for (int j = 0; j < nums.length; j++) {
//                queue.offer(nums[nextIndex]);
//                nums[nextIndex] = queue.remove();
//                index = nextIndex;
//                nextIndex = (index + 1) % nums.length;
//            }
//        }


        // 翻转字符的方法，先把前n-k个字符翻转，再把后面k个字符翻转，最后再把整个字符翻转
        // 定义一个翻转函数，以便重复使用
        Consumer<int[]> reverse = it -> {
            int n = it.length % 2;
            for (int i = 0; i < n; i++) {
                int tmp = it[i];
                it[i] = it[it.length - i];
                it[it.length - i] = tmp;
            }
        };

        reverse.accept(Arrays.copyOfRange(nums, 0, nums.length - k));
        reverse.accept(Arrays.copyOfRange(nums, nums.length - k, nums.length));
        reverse.accept(nums);
    }
}
