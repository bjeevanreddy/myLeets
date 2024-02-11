class Solution {
    public int combinationSum4(int[] nums, int target) {
      HashMap<Integer,Integer> map = new HashMap<>();
        return helper(nums, target, map);
    }
    
    int helper(int[] nums, int target, HashMap<Integer,Integer> map){
         int count=0;
        if(target==0) return 1;
        if(map.containsKey(target)){
            return map.get(target);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=target){
                 count+=helper(nums, target-nums[i],map);
            }
           
        }
        map.put(target,count);
        return count;
    }
}