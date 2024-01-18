class Solution {
    
    // tabulation- bottom-up
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
    
    
    // recursion + memoization -- top-down
     public int climbStairs2(int n) {
        
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
    
    // bottom-up
     public int climbStairs(int n){
         int[] dp = new int[n+1];
         dp[0] = 1;
         dp[1] = 1;
         for(int i=2;i<=n;i++){
             dp[i] = dp[i-1]+dp[i-2];
         }
        return dp[n];
     }
    
     public int climbStairs4(int n){
         
         // int[] dp = new int[n+1];
        int prev = 1;
        int curr = 1;
         for(int i=2;i<=n;i++){
             int value = prev+curr;
             prev=curr;
             curr= value;
         }
        return curr;
     }
    
    int recu(int start, int n){
        if(start==n) {
            return 1;
        }
        if(start>n) return 0;
        return recu(start+1,n) + recu(start+2, n);
    }
    
    int recu1(int n){
        if(n==0) {
            return 1;
        }
        if(n<0) return 0;
        return recu1(n-1) + recu1(n-2);
    }
    
    
}