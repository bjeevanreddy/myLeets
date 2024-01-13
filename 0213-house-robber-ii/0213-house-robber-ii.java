class Solution {
    public int rob1(int[] nums) {
        int n = nums.length;
        if(nums.length==1){
            return nums[0];
        }
       return  helper(nums,0,0);
        
       
    }
    
    static int helper(int[] nums, int s, int l){
        
        if(s >= nums.length - 1 ){
            return 0;
        }
        if(l>=nums.length  && s==0){
           return 0; 
        }
         int pick =  nums[s] + helper(nums, s+2, l+2);
        int dnt =  helper(nums, s+1, l+1);
            
        return Math.max(pick,dnt);
    }
    
    
    //recursion + TLE
     public int rob2(int[] nums) {
     
         if(nums.length==1) return nums[0];
         if(nums.length==2)  return Math.max(nums[0], nums[1]);
         return Math.max(recu2(0, nums.length-1, nums) , recu2(1,nums.length, nums));
    }
    
    int recu2(int s, int end, int[] nums){
        
        if(s>=end) {return 0;}
        int rob = nums[s] + recu2(s+2, end, nums);
         int notRob = recu2(s+1, end, nums);
        
        return Math.max(rob, notRob);
    }
    
    //recursion + Memo
    public int rob(int[] nums) {
     
         if(nums.length==1) return nums[0];
         if(nums.length==2)  return Math.max(nums[0], nums[1]);
        int[] dp = new int[nums.length];
         Arrays.fill(dp,-1);
        int[] dp1 = new int[nums.length];
         Arrays.fill(dp1,-1);
         return Math.max(recu(0, nums.length-1, nums,dp) , recu(1,nums.length, nums,dp1));
    }
    
     
    int recu(int s, int end, int[] nums,int[] dp){
        
        if(s>=end) return 0;
        if(dp[s]!=-1) return dp[s];
        int rob = nums[s] + recu(s+2, end, nums,dp);
         int notRob = recu(s+1, end, nums,dp);
        
        return dp[s] = Math.max(rob, notRob);
    }
    
}