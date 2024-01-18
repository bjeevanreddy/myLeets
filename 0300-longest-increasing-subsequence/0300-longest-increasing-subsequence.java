class Solution {
     int max = 0;
    public int lengthOfLIS(int[] nums) {
        int l = nums.length;
        
        
        int[][] dp= new int[l+1][l+1];
        for(int[] r:dp){
            Arrays.fill(r, -1);
        }
        return subSeqence(nums, 0 , l, -1,dp);
        // return max;
    }
    
    int subSeqence(int[] nums, int start, int l,int prev, int[][] dp){
        
        if(start==l){
            return 0;
        }
        
        if(dp[prev+1][start]!=-1){
            return dp[prev+1][start];
        }
        int pick = 0; int notpick=0;
        if(prev==-1 || nums[start] > nums[prev]){
             pick = 1 + subSeqence(nums, start+1, l, start,dp);
           
        }
        notpick = subSeqence(nums, start+1,l,prev ,dp);
        
        
        return dp[prev+1][start] = Math.max(pick, notpick);
    }
}