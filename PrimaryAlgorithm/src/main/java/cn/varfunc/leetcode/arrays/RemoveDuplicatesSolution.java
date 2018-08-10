package cn.varfunc.leetcode.arrays;

public class RemoveDuplicatesSolution {
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
}
