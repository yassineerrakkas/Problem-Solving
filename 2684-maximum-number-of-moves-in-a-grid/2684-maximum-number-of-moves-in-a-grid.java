class Solution {
    public int maxMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        
        int[] directions = {-1, 0, 1};
        for (int j = m - 2; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                for (int d : directions) {
                    int newRow = i + d;
                    if (newRow >= 0 && newRow < n && grid[i][j] < grid[newRow][j + 1]) {
                        dp[i][j] = Math.max(dp[i][j], dp[newRow][j + 1] + 1);
                    }
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, dp[i][0]);
        }

        return result;
    }
}
