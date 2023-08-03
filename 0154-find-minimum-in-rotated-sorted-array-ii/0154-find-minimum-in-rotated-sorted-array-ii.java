class Solution {
    public int findMin(int[] nums) {
        int L = 0, R = nums.length-1;
      
        while (L < R) {
            int mid= L + (R - L) / 2;
            if(nums[mid] > nums[R]){
                L++;
            }else{
                R--;
            }
        }
        return nums[L];
    }
}