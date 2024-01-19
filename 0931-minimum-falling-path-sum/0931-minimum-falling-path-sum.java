class Solution {
    public int minFallingPathSum1(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int result = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++)
            result = Math.min(result, solve(m - 1, i, matrix));
        
        return result;
    }
    
    private int solve(int m, int n, int[][] matrix){
        
        if(n < 0 || n >= matrix[m].length) return Integer.MAX_VALUE;
        
        if(m == 0) return matrix[0][n];
    
        int up = solve(m - 1, n, matrix);
        int left = solve(m - 1, n - 1, matrix);
        int right = solve(m - 1, n + 1, matrix);
        
        return Math.min(Math.min(left, right), up) + matrix[m][n];
        
    }  
    
     public int minFallingPathSum(int[][] matrix) {
         int n = matrix[0].length;
         int m = matrix.length;
         int[][] dp = new int[m][m];
         
         for(int i=0;i<n;i++){
             dp[0][i] = matrix[0][i];
         }
         
         for(int i=1;i<n;i++){
             for(int j=0;j<n;j++){
                 
                 int a = Integer.MAX_VALUE;
                  int b = Integer.MAX_VALUE;
                 
                 if(j-1 >= 0 ){
                     a = dp[i-1][j-1];
                 }
                 if(j+1<n){
                     b = dp[i-1][j+1];
                 }
                 dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], Math.min(a,b));
             }
         }
         int result = Integer.MAX_VALUE;
         for(int i=0;i<n;i++){
             result = Math.min(result, dp[n-1][i]);
         }
         
         return result;
     }
}