package cn.varfunc.leetcode.strings;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写
 * <p>
 * 本题中，我们将空字符串定义为有效的回文串
 */
public class IsPalindromeSolution {
    public boolean isPalindrome(String s) {
        /* 思路：双指针 */
        if (s.length() == 0) {
            return true;
        }

        String lcs = s.toLowerCase();

        int head = 0;
        int tail = lcs.length() - 1;
        while (head <= tail) {
            if (!Character.isLetterOrDigit(lcs.charAt(head))) {
                head++;
                continue;
            }

            if (!Character.isLetterOrDigit(lcs.charAt(tail))) {
                tail--;
                continue;
            }

            if (lcs.charAt(head) != lcs.charAt(tail)) {
                return false;
            }

            head++;
            tail--;
        }
        return true;
    }
}
