class Solution {
    public int findMaxConsecutiveOnes1(int[] nums) {
        int n = nums.length;
        int start =0;
        int count = 0;
        int max = 0;
        while(start<n){
            if(nums[start]==1){
                count++;
            }
            else {
                max=Math.max(max,count);
                count=0;    
            }
            start++;
        }
        return Math.max(count,max);
        
    }
      public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int start =0;
        int count = 0;
        int max = 0;
        while(start<n){
            if(nums[start]==0){
                count=0;
            }
            else {
                count++;
                max=Math.max(max,count);
               
            }
            start++;
        }
        return max;
        
    }
}