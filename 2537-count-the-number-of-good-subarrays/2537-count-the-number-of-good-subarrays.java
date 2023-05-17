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
    
    //Another solution
    
    /*
      public long countGood(int[] nums, int k) {
       Map<Integer, Integer> map= new HashMap<>();
        long ans = 0;       // to store number of good subarrays
        int pairs = 0;      // to store pairs of current subarray
        int left = 0, right = 0;    // pointers
        while (right < nums.length) {
            // if frequency is 0, and we find an element, we don't have pair yet.
            // If frequency >= 1, we will have pairs. Say frequency of x is 1 and we found x again, 
            // so we have 1 pair now => n same elements = n(n - 1)/2 pairs
            // variable 'pairs' will tell us how many pairs we have got in our current window
            pairs += map.getOrDefault(nums[right], 0);  // update pairs
            // update the frequency in the map 
            map.put(nums[right], 1 + map.getOrDefault(nums[right], 0));
            // If we have found >= k pairs, We will try to shrink the window from left, 
            // else we won't enter the loop
            while (pairs >= k) {
                // we discard the element at the leftmost end of our window
                // and its frequency in the map decreases by 1
                map.put(nums[left], map.get(nums[left]) - 1);
                // why we are doing this, is explained by the attached image
                pairs -= map.get(nums[left]);
                left++;     // we shrink the window from left
            }
            ans += left;    // The left pointer gives us the number of valid pairs in the window [left,right]
			// Note : The siding window we are maintaining here has the min num of elements in range [left,right] 
			// with atleast k pairs, if we extend our window to the left it will by default contain the minimum k pairs + may contain more
			// hence if [left, right] is valid that means [left-1,right] is also valid, [left-2, right] is also valid. 
			// Thus we just add the left pointer to ans as it will contains the range from [0,left-1] which is forming the valid pair with right
            right++;    // expand the window from right
        }

        return ans;
    }
    */
}
