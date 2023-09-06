class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
           
        
        int m = og.length;
        int n = og[0].length;
        int[][] dp = new int[m][n];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        return helper(m-1,n-1,dp,og);
    }
    
    public static int helper(int m, int n, int[][] dp, int[][] og){
        
        if(m<0  ||  n<0){
            return 0;
        }
        
        if(m==0 && n==0 && og[m][n]==0){
            return 1;
        }
        if(og[m][n]==1){
            return 0;
        }
        
        
        
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        
        return dp[m][n] = helper(m,n-1,dp,og) + helper(m-1,n,dp,og);
    }
}
    
    