class Solution {
    public int[] runningSum(int[] nums) {
        int current=0;
        int size = nums.length;
        for(int i=0;i<size;i++){
            current+=nums[i];
            nums[i]= current;
        }

        return nums;
        
    }
}