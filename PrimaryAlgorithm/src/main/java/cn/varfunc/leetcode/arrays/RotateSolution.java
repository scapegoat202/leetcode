package cn.varfunc.leetcode.arrays;

/**
 * 旋转数组
 * <p>
 * 给定一个数组和整数k，k代表把数组中每个元素向右移动的次数，求移动过后的数组
 */
public class RotateSolution {
    public void rotate(int[] nums, int k) {
//        一开是自己想到的解法，没能通过
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

//        想到的另一种解法依旧没能通过
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


        // 对k进行处理，把k映射到[0, 6]的区间上
        int n = k % nums.length;
        if (n < 0) {
            n += nums.length;
        }

        // 翻转字符的方法，先把前n-k个字符翻转，再把后面k个字符翻转，最后再把整个字符翻转
        // 当n为零的时候不需要翻转，这里假定n位于[0, 6]的区间内
        if (n != 0) {
            reverse(nums, 0, nums.length - n);
            reverse(nums, nums.length - n, nums.length);
            reverse(nums, 0, nums.length);
        }
    }

    /**
     * 定义一个翻转函数，以便重复使用
     */
    private void reverse(int[] numbers, int start, int end) {
        for (int i = 0, j = start, k = end - 1; i < (end - start) / 2; i++, j++, k--) {
            int t = numbers[j];
            numbers[j] = numbers[k];
            numbers[k] = t;
        }
    }
}
