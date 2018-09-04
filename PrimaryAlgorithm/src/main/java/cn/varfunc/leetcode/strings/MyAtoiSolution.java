package cn.varfunc.leetcode.strings;

import java.math.BigInteger;

/**
 * 实现 atoi，将字符串转为整数
 * <p>
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字
 * 组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数
 * <p>
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响
 * <p>
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换
 * <p>
 * 若函数不能执行有效的转换，返回 0
 * <p>
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。如果数值超过可表示的范围，则返回  INT_MAX (2^31 − 1)
 * 或 INT_MIN (−2^31)
 */
public class MyAtoiSolution {
    public static int myAtoi(String str) {
        /* 使用BigInteger的解法 */
        String ts = str.trim();
        boolean isNegative = false;
        if (ts.length() > 0) {
            if (ts.charAt(0) == '-') {
                isNegative = true;
            }
        } else {
            return 0;
        }

        BigInteger result = BigInteger.ZERO;

        for (int i = 0; i < ts.length(); i++) {
            if (i == 0) {
                if (isNegative) {
                    continue;
                } else {
                    if (ts.charAt(i) == '+') {
                        continue;
                    }
                }
            }

            if (Character.isDigit(ts.charAt(i))) {
                result = result.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(ts.charAt(i) - '0'));
            } else {
                break;
            }
        }
        if (isNegative) {
            result = result.negate();
        }

        if (result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        } else if (result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE;
        } else {
            return result.intValue();
        }
    }
}
