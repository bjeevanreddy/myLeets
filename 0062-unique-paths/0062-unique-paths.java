class Solution {
    public int uniquePaths1(int m, int n) {
        
        int[][] dp = new int[m][n];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        return helper(m-1,n-1,dp);
    }
    
    public static int helper(int m, int n, int[][] dp){
        
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        
        return dp[m][n] = helper(m,n-1,dp) + helper(m-1,n,dp);
    }
    
    public int uniquePaths2(int m, int n) {
        
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    
    
    // pratcise
     public int uniquePaths(int m, int n) {
         int s=0; int e=0;
         
         if(m==0 && n==0) return 0;
         int dp[][] = new int[m][n];
         for(int[] r:dp){
             Arrays.fill(r, -1);
         }
         return helper2(m, n, s, e,dp);
         
     }
    
    
    int helper2(int m, int n, int s, int e, int[][] dp){
        
        if(s>=m || e>=n) return 0;
        
        if(s==m-1 || e==n-1) return 1; 
        
        if(dp[s][e]!=-1){
            return dp[s][e];
        }
        
        int right = helper2(m, n, s+1, e, dp);
        int left = helper2(m, n, s, e+1, dp);
        
        return dp[s][e]=right+left;
    }
    
}