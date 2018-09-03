package cn.varfunc.leetcode.strings;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词
 * <p>
 * 你可以假设字符串只包含小写字母
 * <p>
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class IsAnagramSolution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        /* 如果两个字符串各个字母出现的次数相同，则两词互为字母异位词 */
        final char A = 'a';
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - A;
            count[index]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - A;
            count[index]--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
