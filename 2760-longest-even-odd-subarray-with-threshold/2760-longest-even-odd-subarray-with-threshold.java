class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int s=0;
        int e=0;
        int len=0;
        
        
        while(s<nums.length){
            int l= nums[s];
            
            if(l<=threshold && l%2==0){
                e=s+1;
                while(e<nums.length && nums[e]<=threshold && nums[e-1]%2 != nums[e]%2){
                     e++;   
                }
                 len = Math.max(len,e-s);
                    
                }
            s++;
        }
        return len;
        }
}