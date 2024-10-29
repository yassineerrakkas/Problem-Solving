class Solution {
    Integer[][] dp;
    int m, n;
    int[][] grid;
    public int maxMoves(int[][] grid) {
        m = grid.length; n = grid[0].length;
        this.grid = grid;
        dp = new Integer[m][n];
        var res = 0;
        for(var i=0; i<m; i++){
            res = Math.max(memoSolve(i, 0), res);
        }
        return res;
    }
    int memoSolve(int i, int j) {
        if (dp[i][j] != null) return dp[i][j]; // Assuming dp is initialized with -1
        int res = 0;
        int[][] directions = {{-1, 1}, {0, 1}, {1, 1}};
        for (int[] dir : directions) {
            int ni = i + dir[0], nj = j + dir[1];
            if (ni >= 0 && ni < m && nj < n && grid[ni][nj] > grid[i][j]) {
                res = Math.max(res, 1 + memoSolve(ni, nj));
            }
        }
        return dp[i][j] = res;
    }

}