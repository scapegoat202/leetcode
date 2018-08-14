package cn.varfunc.leetcode.strings;

public class ReverseStringSolution {
    public String reverseString(String s) {
//        /* 新建字符数组，分别赋值 */
//        int length = s.length();
//        char[] reversedString = new char[s.length()];
//        for (int i = 0; i < reversedString.length; i++) {
//            reversedString[i] = s.charAt(length - 1 - i);
//        }
//        return String.valueOf(reversedString);

        /* 字符串转成字符数组，反转 */
        char[] reversedString = s.toCharArray();
        for (int i = 0; i < reversedString.length / 2; i++) {
            char tmp = reversedString[i];
            reversedString[i] = reversedString[reversedString.length - 1 - i];
            reversedString[reversedString.length - 1 - i] = tmp;
        }
        return String.valueOf(reversedString);
    }
}
