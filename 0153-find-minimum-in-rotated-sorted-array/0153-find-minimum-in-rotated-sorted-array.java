class Solution {
    public int findMin1(int[] nums) {
        
        Arrays.sort(nums);
        return nums[0];
    }
    public int findMin(int[] nums) {
        
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
        }
        return min;
    }
}