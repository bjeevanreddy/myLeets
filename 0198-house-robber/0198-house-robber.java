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
    
    public int rob2(int[] nums) {
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
    
    
    //recursion
    public int rob3(int[] nums) {
        return recu3(0, nums);
    }
    static int recu3(int s, int[] nums){
        if(s>nums.length-1) return 0;
        return Math.max(nums[s]+ recu3(s+2, nums) ,recu3(s+1, nums));
    }
    
     //recursion + memo
    public int rob4(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return recu(0, nums, dp);
    }
    static int recu(int s, int[] nums, int[] dp){
        if(s>nums.length-1) return 0;
        if(dp[s]!=-1){
            return dp[s];
        }
        return dp[s] = Math.max(nums[s] + recu(s+2, nums,dp) ,recu(s+1, nums,dp));
    }
    
     //bottom up 
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1] ,nums[i] + dp[i-2]);
            // System.out.println(dp[i]);
        }
        
        return dp[nums.length-1];
    }
        
        
}

