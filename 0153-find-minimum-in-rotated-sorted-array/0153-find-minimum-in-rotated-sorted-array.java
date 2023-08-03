class Solution {
    public int findMin1(int[] nums) {
        
        Arrays.sort(nums);
        return nums[0];
    }
    public int findMin2(int[] nums) {
        
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
        }
        return min;
    }
     public int findMin(int[] nums) {
        
        int L=0, R=nums.length-1;
         
         if(nums[L]<nums[R]) return nums[L];
       
         while(L<R){
             int mid = L + (R-L)/2;
             
             if(nums[mid]>nums[R]){
                 L=mid+1;
             }else{
                 R = mid;
             }
         }
        return nums[L];
    }
}