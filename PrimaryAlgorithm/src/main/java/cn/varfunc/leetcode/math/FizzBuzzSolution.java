package cn.varfunc.leetcode.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean divisibleByThree = i % 3 == 0;
            boolean divisibleByFive = i % 5 == 0;
            if (divisibleByThree && !divisibleByFive) {
                result.add("Fizz");
            } else if (!divisibleByThree && divisibleByFive) {
                result.add("Buzz");
            } else if (divisibleByThree) {
                result.add("FizzBuzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
