class Solution {
    public int solve1(int cost[],int n,int[] dp)
    {
        //step1:base case
        if(n==0 || n==1)
        return cost[n];

        //step3:completed
        if(dp[n] != -1)
        return dp[n];

        //step2
        dp[n]=cost[n]+Math.min(solve1(cost, n-1 ,dp) , solve1(cost , n-2 , dp));
        return dp[n];

    }
    public int minCostClimbingStairs1(int[] cost) 
    {
        int n=cost.length;

        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i]=-1;
        }
        int ans=Math.min(solve1(cost, n-1 ,dp) , solve1(cost , n-2 , dp));
        return ans;
    }
    
    public int minCostClimbingStairs(int[] cost) {
        
         if(cost.length==1 || cost.length==2){
            return Math.min(cost[0], cost[1]);
        }
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost,0,dp),solve(cost,1,dp));
    }
    
    int solve(int[] cost, int start, int[] dp){
        if(start>=cost.length){
            return 0;
        }
        if(dp[start]!=-1){
            return dp[start];
        }
       
        int one = solve(cost, start+1,dp);
        int two = solve(cost, start+2,dp);
        
        return dp[start] = cost[start] + Math.min(one,two);
    }
    
    
}