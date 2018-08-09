package test.cn.varfunc.leetcode.testArrays;

import cn.varfunc.leetcode.arrays.RemoveDuplicatesSolution;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesSolutionTest {
    @Test
    public void removeDuplicatesTest() {
        Assert.assertEquals(5, new RemoveDuplicatesSolution().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
}