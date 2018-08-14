package cn.varfunc.leetcode.arrays;

/**
 * 旋转图像
 * <p>
 * 将一个给定的数组顺时针旋转90度，使用原地算法
 */
public class RotateMatrixSolution {
    public void rotateMatrix(int[][] matrix) {
        /* 调换对角元素 */
        for (int i = 0; i < matrix.length; i++) {
            /* 只需要调换（n^2 - 3*n/2）次 */
            for (int j = i; j < matrix[i].length; j++) {
                if (i != j) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
        }

        /* 调换列元素 */
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                if (matrix[i].length - 1 - j != j) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                    matrix[i][matrix[i].length - 1 - j] = tmp;
                }
            }
        }
    }
}
