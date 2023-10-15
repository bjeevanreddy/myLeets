class Solution {
      int MOD = (int) 1e9 + 7;
    public int numWays(int steps, int arrLen) {
        
        arrLen= Math.min(steps,arrLen);
        int dp[][] = new int[steps+1][arrLen];
        
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        
        return solve(steps, arrLen, 0,dp)%MOD;
        
    }
    
    int solve(int steps, int arrLen, int start, int[][] dp){
        
        if(steps==0 && start==0){
            return 1;
        }
        if(start<0 || start>=arrLen || steps<0){
            return 0;
        }
        
        if(dp[steps][start]!=-1){
            return dp[steps][start];
        }
        
        int stay = solve(steps-1, arrLen, start,dp) % MOD;
        int left = solve(steps-1, arrLen, start-1,dp) %MOD ;
        int right = solve(steps-1, arrLen, start+1,dp) %MOD;
        
        return dp[steps][start]= ((left + stay) % MOD + right) % MOD;
    }
}