class Solution {
    
    // brutforce
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int k=i+1;k<nums.length;k++){
                if(nums[i]+nums[k]==target){
                    return new int[]{i, k};
                    
                }
            }
        }
        
        return new int[]{};
    }
     public int[] twoSum2(int[] nums, int target) {
         Map<Integer,Integer> map = new HashMap<>();
          int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])){
                     arr[0]= map.get(target-nums[i]);
                     arr[1]= i;
                    return arr;
                }
                else{
                    map.put(nums[i],i);
                }
           
        }
        
        return arr;
    }
    public int[] twoSum1(int[] nums,int target){
        Arrays.sort(nums);
        int[] res = new int[2];
            int i=0;
            int k=nums.length-1;
            
            while(i<k){
                int sum = nums[i]+nums[k];
                if(sum==target){
                    res[0]=i;
                    res[1]=k;
                    return res;
                }
                else if(sum<target){
                    i++;
                }
                else{
                    k--;
                }
            }
        
        return res;
    }
}