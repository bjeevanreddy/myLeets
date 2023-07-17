class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int k=0;
        int o=1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[k] = nums[i];
                k=k+2; 
            }else{
                res[o] = nums[i];
                o=o+2;
            }
        }
        return res;
    }
    
    void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j]=t;
    }
}