class Solution {
    public int[] applyOperations(int[] nums) {
        
        int n=nums.length;
        
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1]=0;
            }
        }
        
        int end=0;
        for(int i=0;i< n;i++){
            if(nums[i]!=0){
                swap(nums, i, end);
                end++;
            }
        }
        return nums;
    }
    
    static void swap(int[] a, int i, int e){
        int t = a[i];
        a[i]=a[e];
        a[e]=t;
    }
}