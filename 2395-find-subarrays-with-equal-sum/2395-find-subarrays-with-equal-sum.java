class Solution {
    public boolean findSubarrays(int[] nums) {
        int l = 1;
        // int r = 1;
        // int sum = nums[l] + nums[r];
        // l++;
        // r++;
        // int c = 1;
        HashSet<Integer> set = new HashSet<>();
            while(l<nums.length){
                 int sum = nums[l-1] + nums[l];
                if(set.contains(sum)){
                    return true;
                }
                else{
                    set.add(sum);
                }
                l++;
        }
        
        return false;
    }
}