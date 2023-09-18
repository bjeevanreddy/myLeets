class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return helper(prices, 0,1, prices.length,dp);
        
    }
    
    int helper(int[] arr, int index,int bf, int n,int[][] dp){
        
        if(index==n){
            return 0;
        }
        if(dp[index][bf]!=-1){
            return dp[index][bf];
        }
        int profit = 0;
        
        if(bf==1){
         profit= Math.max(-arr[index] + helper(arr, index+1, 0, n,dp),
                         helper(arr, index+1, 1, n,dp));
        }
        else{
        profit= Math.max(arr[index] + helper(arr, index+1, 1, n,dp), helper(arr, index+1, 0, n,dp));
        }
        
        return dp[index][bf] = profit;
        
    }
}