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
        return subSet1(nums,nums.length-1,sum/2,dp);
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
}