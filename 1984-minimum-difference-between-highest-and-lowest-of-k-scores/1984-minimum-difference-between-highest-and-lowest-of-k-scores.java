class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int i=0;int j=0;
        while( j<nums.length){
            
            if(j-i+1<k){
                j++;
            }else{
            min = Math.min(min, nums[j]-nums[i]);
            i++;
            j=i;
            }
        }
        
        return min;
    }
}