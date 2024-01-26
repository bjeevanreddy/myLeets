class Solution {
     int M = 1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
       
        int[][][] dp=new int[m][n][maxMove+1];
          for (int[][] l : dp) for (int[] sl : l) Arrays.fill(sl, -1);
        return solve(m,n,maxMove, startRow, startColumn,dp);
    }
    
    int solve(int m, int n, int max, int row, int col,int[][][] dp){
        if(row<0 || row==m || col<0 || col==n ){
            return 1;
        }if(max==0) return 0;
        
        if(dp[row][col][max]>=0) return dp[row][col][max] ;
        int one =  solve(m, n, max-1, row+1, col,dp) %M;
        int two = solve(m, n, max-1, row-1, col,dp) % M;
        int three = solve(m, n, max-1, row, col-1,dp) % M;
        int four = solve(m, n, max-1, row, col+1,dp) %M;
        return dp[row][col][max]=((one +two)%M +(three +four)%M) % M;
    }
}