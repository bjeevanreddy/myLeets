class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums;
        int res[] = new int[nums.length-k+1];
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int s=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
           res[0]= map.lastKey();
        // res[s]= max;
        for(int i=k;i<nums.length;i++){
           map.put(nums[i-k], map.get(nums[i-k])-1);
            if(map.get(nums[i-k])==0){
                map.remove(nums[i-k]);
            }
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            res[i-k+1]=map.lastKey();
        }
        
        return res;
        
    }
}