class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        
        
        int n = grid[0].length;
        int m = grid.length;
        int[][][] dp = new int[m][n][k];
        
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int x=0;x<k;x++)
                    dp[i][j][x] =-1;
            }
            
        }
        
        return helper(grid,m-1, n-1,dp, k,0);
    }
    
    static int helper(int[][] grid, int m, int n, int[][][] dp, int k, int sum){
        
        if(m==0 && n==0){
            sum+=grid[m][n];
            return sum%k == 0 ? 1 : 0;
        }
        
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n][sum%k]!=-1){
            return dp[m][n][sum%k];
        }
        
        int left = helper(grid,m,n-1,dp, k,sum+grid[m][n]);
        
        int up = helper(grid,m-1,n,dp, k,sum+grid[m][n]);
        
        return dp[m][n][sum%k] = (left+up)  % 1000000007;
    }
}