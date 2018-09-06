package cn.varfunc.leetcode.strings;

/**
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回  -1
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符
 */
public class StrStrSolution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m > n) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                k++;
                i = k;
                j = 0;
            }
        }

        if (j == m) {
            return k;
        } else {
            return -1;
        }
    }
}
