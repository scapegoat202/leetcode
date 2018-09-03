package cn.varfunc.leetcode.strings;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1
 * <p>
 * 可以假定该字符串只包含小写字母
 */
public class FirstUniqCharSolution {
    public int firstUniqChar(String s) {
//        /* 使用Map的解法，在Map里key为s中存在的字符，value为其出现的次数 */
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (map.containsKey(s.charAt(i))) {
//                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//            } else {
//                map.put(s.charAt(i), 1);
//            }
//        }
//
//        int index = -1;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (map.get(s.charAt(i)) == 1) {
//                index = i;
//                break;
//            }
//        }
//
//        return index;

        int result = -1;
        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c)) {
                result = (result != -1) ? Math.min(result, index) : index;
            }
        }
        return result;
    }
}
