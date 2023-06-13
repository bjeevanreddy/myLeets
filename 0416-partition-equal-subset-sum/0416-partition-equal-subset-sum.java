class Solution {
     
    public boolean canPartition(int[] nums) {
        
        int sum  = 0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2== 1){
            return false;
        }
         Boolean dp[][] = new Boolean[nums.length+1][sum/2+1];
        // return subSet1(nums,nums.length-1,sum/2,dp);
        
        return subset2(nums,sum/2);
    }
    
    static boolean subSet(int[] nums, int n, int sum){
        
        if(sum==0){
            return true;
        }
        if(sum<0 || n<0){
            return false;
        }
        
        if(nums[n]>sum){
            return subSet(nums,n-1,sum);
        }
        
        return subSet(nums,n-1,sum) || subSet(nums,n-1,sum-nums[n]);
    }
    
    //recurion + memoization
    static boolean subSet1(int[] nums, int n, int sum,Boolean[][] dp){
           
         
        
        if(sum==0){
            return true;
        }
        if(sum<0 || n<0){
            return false;
        }
        
        if(nums[n]>sum){
            return subSet1(nums,n-1,sum,dp);
        }
         
         if(dp[n][sum] != null){
             return dp[n][sum];
         }
        
        return dp[n][sum] = subSet1(nums,n-1,sum,dp) || subSet1(nums,n-1,sum-nums[n],dp);
    }
    
    //dp
    
    
    static boolean subset2(int[] nums, int sum){
        
        boolean dp[][] = new boolean[nums.length+1][sum+1];
        
        for(int i=0;i<nums.length;i++){
            dp[i][0] = true;
        }
        
        for(int i=1;i<=nums.length;i++){
            for(int j=1;j<=sum;j++){
                
                if(nums[i-1]>j){
                     dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]  = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
                
            }
        }
        
        return dp[nums.length][sum];
    }
    
}