class Solution {
    
    //Variable length sliding window
    // we dont have fixed size
    // we have condition to break a window, at least k
    // while for checking condition inside the window
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long res = 0, pairs = 0;
        int start = 0, end = 0;        
        for(; end < nums.length; ++end){
            int n = nums[end];
            map.put(n, map.getOrDefault(n, 0) + 1);
            pairs += map.get(n) - 1;
            while(pairs >= k){
                res += (long)nums.length - end;
                n = nums[start++];
                pairs -= (long)map.get(n) - 1;                    
                map.put(n, map.get(n) - 1);     
            }
        }
        return res;
    }
}