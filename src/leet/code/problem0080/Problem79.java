package leet.code.problem0080;

/**
 * 79. 单词搜索
 *
 * @author wbxing
 * @date 2020/09/13
 */
public class Problem79 {
    public static void main(String[] args) {
        Problem79 problem79 = new Problem79();
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        System.out.println(problem79.exist(board, "ABCCED"));

    }

    public boolean exist(char[][] board, String word) {
        int h = board.length, w = board[0].length;
        boolean[][] visited = new boolean[h][w];
//        System.out.println(Arrays.deepToString(visited));
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean flag = check(board, visited, i, j, word, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
        if (board[i][j] != s.charAt(k)) {
            return false;
        } else if (k == s.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int x = i + dir[0];
            int y = j + dir[1];
            if ((x >= 0 && x < board.length) && (y >= 0 && y < board[0].length)) {
                if (!visited[x][y]) {
                    boolean flag = check(board, visited, x, y, s, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }
}
