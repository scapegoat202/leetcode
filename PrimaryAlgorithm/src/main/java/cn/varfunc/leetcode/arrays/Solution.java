package cn.varfunc.leetcode.arrays;

import java.util.Arrays;
import java.util.function.Consumer;

public class Solution {
    public int removeDuplicates(int[] nums) {
//        if (nums.length < 2) {
//            return nums.length;
//        }
//
//        // 设置新数组的长度为1，默认第一个元素为不重复的元素
//        int currentSize = 1;
//        boolean isSwapNeeded = false;
//        // 从第二个元素开始检查
//        for (int i = 1; i < nums.length; i++) {
//            boolean isDuplicate = false;
//            for (int j = i - 1; j >= 0; j--) {
//                if (nums[i] == nums[j]) {
//                    isDuplicate = true;
//                    if (!isSwapNeeded) {
//                        isSwapNeeded = true;
//                    }
//                }
//            }
//            if (!isDuplicate) {
//                // 如果元素不是重复的，那么把元素换到新的位置上
//                if (isSwapNeeded) {
//                    nums[currentSize] = nums[i];
//                }
//                currentSize++;
//            }
//        }
//        return currentSize;

        final int maxDuplicate = 2;
        boolean isSwapNeeded = false;
        int currentIndex = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                if (count < maxDuplicate) {
                    currentIndex++;
                    if (isSwapNeeded) {
                        nums[currentIndex] = nums[i];
                    }
                }
                count++;
            } else {
                count = 1;
                nums[++currentIndex] = nums[i];
            }

            if (count == 3 && !isSwapNeeded) {
                isSwapNeeded = true;
            }
        }
        return ++currentIndex;
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

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

//    private void myRotate(int[] nums, int k, int offset, int n) {
//        int index = offset;
//        int nextIndex = (index + k) % nums.length;
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(nums[index]);
//        for (int i = 0; i < n; i++) {
//            queue.offer(nums[nextIndex]);
//            nums[nextIndex] = queue.remove();
//            index = nextIndex;
//            nextIndex = (index + k) % nums.length;
//        }
//    }
}
