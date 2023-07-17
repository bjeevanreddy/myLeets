class Solution {
    
    // using extra array
    public int[] sortArrayByParityII1(int[] nums) {
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
    
     // using in-place swaps
    public int[] sortArrayByParityII(int[] nums) {
        int e=0;
        int o=1;
        int n= nums.length;
        // int[] res = new int[nums.length];
       while(e<n && o<n){
            
            while(e<n && nums[e]%2==0){
                e=e+2;
            }
          
            while(o<n && nums[o]%2!=0){
                o=o+2;
            }
            if(e<nums.length && o<nums.length){
                swap(nums, o, e);
            }
            
           
        }
        return nums;
    }
    
    void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j]=t;
    }
}