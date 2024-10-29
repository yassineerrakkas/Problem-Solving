class Solution {
    public int maxMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int j = m-2; j >= 0; j--){
            for(int i = 0; i<n; i++){
                for(int k = -1; k < 2; k++){
                    if(i+k < 0 || i+k > n-1) continue;
                    if(grid[i][j] < grid[i+k][j+1]) dp[i][j] = Math.max(dp[i][j],dp[i+k][j+1]+1);
                }
            }
        }
        int res = 0;
        for(int i = 0; i<n; i++){
            res = Math.max(res,dp[i][0]);
        }
        return res;
    }
}