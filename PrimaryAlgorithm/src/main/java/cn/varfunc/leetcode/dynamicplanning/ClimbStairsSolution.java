package cn.varfunc.leetcode.dynamicplanning;

/**
 * 爬楼梯
 * <p>
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢?
 */
public class ClimbStairsSolution {
    public int climbStairs(int n) {
//        /* 最简单的递归算法 */
//        if (n > 2) {
//            return climbStairs(n - 1) + climbStairs(n - 2);
//        } else if (n == 2) {
//            return 2;
//        } else {
//            return 1;
//        }

        /* 以空间换时间 */
        if (n > 2) {
            int[] arr = new int[n - 1];
            arr[0] = 1;
            arr[1] = 2;

            int i = 3;
            while (i < n) {
                arr[i - 1] = arr[i - 2] + arr[i - 3];
                i++;
            }
            return arr[i - 2] + arr[i - 3];
        } else if (n == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}
