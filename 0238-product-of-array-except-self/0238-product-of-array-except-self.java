class Solution {
    
    //using division
    public int[] productExceptSelf1(int[] nums) {
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
    
    //using extra array
     public int[] productExceptSelf(int[] nums) {
       int res[] = new int[nums.length];
         
         int temp=1;
        for(int i=0;i<nums.length;i++){
            res[i]=temp;
            temp = temp * nums[i];
        }
        temp=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] = res[i] * temp;
            temp = temp * nums[i];
        }
        
        return res;
    }
}