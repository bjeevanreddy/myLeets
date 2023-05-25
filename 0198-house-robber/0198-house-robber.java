class Solution {
    public int rob1(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if (n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        
        return helper(nums,n-1);
    }
    
    static int helper(int[] nums, int n){
        
        if(n<0){
            return 0;
        }
        if(n==0){
            return nums[0];
        }
        
        int pick =  helper(nums, n-2) + nums[n];
        int notPick =   helper(nums,n-1);
        return Math.max(pick,notPick);
    }
    
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==0) return 0;
        int[] dp = new int[n+1];
        
      dp[0] = 0;
       dp[1] = nums[0];
        
        for(int i=1;i<n;i++){
            dp[i+1] = Math.max(dp[i],dp[i-1]+nums[i]);
        }
        
        return dp[n];
    }
}

