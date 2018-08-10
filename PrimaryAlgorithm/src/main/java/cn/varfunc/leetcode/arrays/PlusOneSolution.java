package cn.varfunc.leetcode.arrays;

/**
 * 加一
 * <p>
 * 给定一个非负非空数组，代表一个正整数，假定除了0意外，该数组的开头均不为零，然后给该数子加一，求新的数组
 */
public class PlusOneSolution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i + 1] >= 10) {
                digits[i] += 1;
                digits[i + 1] %= 10;
            }
        }
        int[] newDigits;
        if (digits[0] >= 10) {
            newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            digits[0] %= 10;
            System.arraycopy(digits, 0, newDigits, 1, newDigits.length - 1);
        } else {
            newDigits = new int[digits.length];
            System.arraycopy(digits, 0, newDigits, 0, digits.length);
        }

        return newDigits;
    }
}
