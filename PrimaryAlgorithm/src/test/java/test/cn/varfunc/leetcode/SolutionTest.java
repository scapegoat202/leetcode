package test.cn.varfunc.leetcode;

import cn.varfunc.leetcode.arrays.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void removeDuplicatesTest() {
        Assert.assertEquals(5, new Solution().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

    @Test
    public void maxProfitTest() {
        Assert.assertEquals(7, new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void rotateTest() {
        int[] nums = new int[]{1, 2};
        new Solution().rotate(nums, 1);
        Assert.assertArrayEquals(new int[]{2, 1}, nums);
    }
}