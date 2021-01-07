package leet.code.problem0550;

/**
 * 547. 省份数量
 *
 * @author wbxing
 * @date 2021/01/07
 */
public class Problem547 {

    public static void main(String[] args) {
        Problem547 problem547 = new Problem547();
        int n = 4;
        int[][] nums = new int[n][n];
        nums[0] = new int[]{1, 0, 0, 1};
        nums[1] = new int[]{0, 1, 1, 0};
        nums[2] = new int[]{0, 1, 1, 1};
        nums[3] = new int[]{1, 0, 1, 1};
        System.out.println(problem547.findCircleNum(nums));

    }

    public int findCircleNum(int[][] isConnected) {
        if (isConnected == null || isConnected.length == 0) {
            return 0;
        }
        if (isConnected.length == 1) {
            return 1;
        }

        int provinces = 0;
        int cities = isConnected.length;
        boolean[] visited = new boolean[cities];
        for (int i = 0; i < cities; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, cities, i);
                provinces++;
            }
        }
        return provinces;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int cities, int i) {
        for (int j = 0; j < cities; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, visited, cities, j);
            }
        }
    }
}
