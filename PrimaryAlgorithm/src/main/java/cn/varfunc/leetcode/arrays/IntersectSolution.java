package cn.varfunc.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 两个数组的交集
 */
public class IntersectSolution {
    public int[] intersect(int[] nums1, int[] nums2) {
//        /* 使用map的解法*/
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : nums1) {
//            if (map.containsKey(i)) {
//                map.put(i, map.get(i) + 1);
//            } else {
//                map.put(i, 1);
//            }
//        }
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i : nums2) {
//            if (map.containsKey(i) && map.get(i) > 0) {
//                list.add(i);
//                map.put(i, map.get(i) - 1);
//            }
//        }
//
//        int[] ans = new int[list.size()];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = list.get(i);
//        }
//        return ans;


        /* 排序数组的解法 */
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list;

        if (nums1.length >= nums2.length) {
            list = new ArrayList<>(nums2.length);
        } else {
            list = new ArrayList<>(nums1.length);
        }

        int x = 0, y = 0;
        while (x < nums1.length && y < nums2.length) {
            if (nums1[x] == nums2[y]) {
                list.add(nums1[x]);
                x++;
                y++;
            } else if (nums1[x] > nums2[y]) {
                y++;
            } else {
                x++;
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
