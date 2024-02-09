class Solution {
    public int numSquares1(int n) {
        int[] dp = new int[n + 1];
       Arrays.fill(dp, Integer.MAX_VALUE);
       dp[0] = 0;
       for(int i = 0; i <= n; i++){
           for(int j = 1; i + j * j <= n; j++){
               dp[i  + j * j] = Math.min(dp[i + j * j], dp[i] + 1);
            }
       }
       return dp[n];
    }
    
    //recursion
     int ans=0;
     public int numSquares2(int n){
        if(n<4){
            return n;
        }
         ans=n;
         for(int i=1;i*i<=n;i++){
             int s = i*i;
             ans = Math.min(ans, 1+numSquares(n-s));
         }
         
         return ans;
     }
   
    // Arrays.fill(dp,-1);
    
    public int numSquares(int n){
         int[] dp = new int[n+1];
        return helper(n, dp);
    }
    
    int helper(int n, int[] dp){
         if(n<4){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
         ans=n;
         for(int i=1;i*i<=n;i++){
             int s = i*i;
             ans = Math.min(ans, 1+helper(n-s, dp));
         }
         
         return dp[n]=ans;
     }
       
}