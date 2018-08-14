package cn.varfunc.leetcode.arrays;

/**
 * 有效的数独
 * <p>
 * 验证一个数独是否有效
 * 1. 每一行出现的数字不重复
 * 2. 每一恐怕出现的数字不重复
 * 3. 粗线所划出的9*9方格内的数字不重复
 * 一个有效的数独不一定出有解的
 */
public class ValidSudokuSolution {
    public boolean isValidSudoku(char[][] board) {
        /* 一维下标代表第几行第几列或第几个各自，二维下标表示改行 */
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    int k = i / 3 * 3 + j / 3;

                    /* 如果数字已存在就说明该数独是无效的 */
                    if (rows[i][num] || cols[j][num] || boxes[k][num]) {
                        return false;
                    } else {
                        rows[i][num] = true;
                        cols[j][num] = true;
                        boxes[k][num] = true;
                    }
                }
            }
        }
        return true;
    }
}
