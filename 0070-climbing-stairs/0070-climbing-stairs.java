class Solution {
    
    
    public int climbStairs1(int n) {
        
      
        if(n<=2){
            return n;
        }
        int[] arr = new int[n+1];
        arr[1]=1;
        arr[2]=2;
        
        for(int i=3;i<=n;i++){
            
            arr[i] =  arr[i-1] + arr[i-2]; 
        }
        
        return arr[n];
        
    }
    
     public int climbStairs(int n) {
        
      int dp[] = new int[n+1];
    
         Arrays.fill(dp,-1);
         
         return helper(n, dp);
     }
    
    static int helper(int n,int[] dp){
        
        if(n<=2){
            return n;
        }
         
         if(dp[n]!=-1){
             return dp[n];
         }
        
         
         return dp[n] = helper(n-1,dp)+helper(n-2,dp);
        
    }
}