class Solution {
    public int longestConsecutive(int[] nums) {
        
        // 0 1 2 3 4  5 6 7 8
        
        if(nums.length==0){
            return 0;
        }
        
        Arrays.sort(nums);
        int max1 = 1;
        int count = 1;
      
        for(int i=0;i<nums.length-1;i++){
            int curr = nums[i];
             
             if (curr != nums[i+1]) {
            if(curr+1 == nums[i+1]){
                 // System.out.print(nums[i+1]+ " ");
                count++;
            }else{
                max1= Math.max(max1,count);
                // System.out.print(count+ " ");
                count = 1;
            }
             }
        }
        
        return Math.max(max1,count);
        
    }
}