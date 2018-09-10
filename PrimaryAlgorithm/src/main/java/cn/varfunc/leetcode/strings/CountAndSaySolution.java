package cn.varfunc.leetcode.strings;

/**
 * 数数并说
 * <p>
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数
 * 给定一个正整数 n ，输出报数序列的第 n 项
 * 注意：整数顺序将表示为一个字符串
 */
public class CountAndSaySolution {
    public String countAndSay(int n) {
        String result = "1";
        if (n == 1) {
            return result;
        } else {
            while (n > 1) {
                StringBuilder builder = new StringBuilder();
                char[] charArray = result.toCharArray();
                char value = charArray[0];
                int count = 1;
                int i = 1;
                while (i < charArray.length) {
                    if (charArray[i] == value) {
                        count++;
                        i++;
                        continue;
                    } else {
                        builder.append(count);
                        builder.append(value);
                        value = charArray[i];
                        count = 1;
                    }
                    i++;
                }
                builder.append(count);
                builder.append(value);
                result = builder.toString();
                n--;
            }
        }
        return result;
    }
}
