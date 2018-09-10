package cn.varfunc.leetcode.strings;

/**
 * 最长公共前缀
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀
 * 如果不存在公共前缀，返回空字符串
 * 所有输入只包含小写字母 a-z
 */
public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        } else {
            int minLength = Integer.MAX_VALUE;
            for (String str : strs) {
                minLength = Math.min(minLength, str.length());
            }

            int lengthOfCommonPrefix = 0;
            for (int i = 0; i < minLength; i++) {
                char value = strs[0].charAt(i);
                int count = 1;
                for (int j = 1; j < strs.length; j++) {
                    if (value != strs[j].charAt(i)) {
                        break;
                    }
                    count++;
                }

                if (count == strs.length) {
                    lengthOfCommonPrefix++;
                } else {
                    break;
                }
            }

            return strs[0].substring(0, lengthOfCommonPrefix);
        }
    }
}
