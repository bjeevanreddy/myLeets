class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zero=0;
        for(int i:nums){
            if(i!=0){
                 prod*=i;
            }
            else{
                zero++;
                if(zero==2) break;
            }
           
        }
        
        for(int i=0;i<nums.length;i++){
            if(zero==2) nums[i] = 0;
            else if(zero==1){
                 if(nums[i]==0) nums[i] = prod;
                
                 else nums[i] = 0;
            }else{
                nums[i] = prod/nums[i];
            }
        }
        
        return nums;
    }
}