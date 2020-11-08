package leet.code.problem0040;

/**
 * 36. 有效的数独
 *
 * @author wbxing
 * @date 2020/11/08
 */
public class Problem36 {

    public static void main(String[] args) {
        String[][] strings = new String[9][9];
        char[][] chars = new char[9][9];
        strings[0] = new String[]{"5","3",".",".","7",".",".",".","."};
        strings[1] = new String[]{"6",".",".","1","9","5",".",".","."};
        strings[2] = new String[]{".","9","8",".",".",".",".","6","."};
        strings[3] = new String[]{"8",".",".",".","6",".",".",".","3"};
        strings[4] = new String[]{"4",".",".","8",".","3",".",".","1"};
        strings[5] = new String[]{"7",".",".",".","2",".",".",".","6"};
        strings[6] = new String[]{".","6",".",".",".",".","2","8","."};
        strings[7] = new String[]{".",".",".","4","1","9",".",".","5"};
        strings[8] = new String[]{".",".",".",".","8",".",".","7","9"};

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                chars[i][j] = strings[i][j].toCharArray()[0];
            }
        }

        Problem36 problem36 = new Problem36();
        System.out.println(problem36.isValidSudoku(chars));
    }

    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] box = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int indexBox = (i / 3) * 3 + j / 3;

                    if (row[i][num] == 1) {
                        return false;
                    } else {
                        row[i][num] = 1;
                    }

                    if (col[j][num] == 1) {
                        return false;
                    } else {
                        col[j][num] = 1;
                    }

                    if (box[indexBox][num] == 1) {
                        return false;
                    } else {
                        box[indexBox][num] = 1;
                    }
                }
            }
        }
        return true;
    }
}
