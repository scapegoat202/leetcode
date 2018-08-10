package cn.varfunc.leetcode.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 两个数组的交集
 */
public class IntersectSolution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new LinkedList<>();
        Arrays.stream(nums1).forEach(list1::add);
        List<Integer> list2 = new LinkedList<>();
        Arrays.stream(nums2).forEach(list2::add);
        List<Integer> list3 = new LinkedList<>();

        for (int result = getCommon(list1, list2); result != -1; result = getCommon(list1, list2)) {
            list3.add(result);
        }
        int[] ans = new int[list3.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list3.get(i);
        }
        return ans;
    }

    private int getCommon(List<Integer> list1, List<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    list1.remove(i);
                    return list2.remove(j);
                }
            }
        }
        return -1;
    }
}
