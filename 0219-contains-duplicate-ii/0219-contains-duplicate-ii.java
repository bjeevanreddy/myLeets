class Solution {
    public boolean containsNearbyDuplicate1(int[] nums, int k) {

        int l=0, r=nums.length-1;
        if(r-l > k){
            return false;
        }
        while(l<r){
            if(nums[l]==nums[r]){
                if(r-l <=k){
                    return true;
                }
            }else{
                l++;
                r--;
            }
        }

        return false;
        
    }


    // Map<Integer,Integer> set = new HashMap<>();
    // for(int i=0;i<nums.length;i++){
    //     if(set.containsKey(nums[i])){
    //        if(i-set.get(nums[i])<=k) return true;
    //     }
    //     set.put(nums[i],i);
    // }
    // return false;
    // }

//     if (nums.length <= 1 || k == 0) {
//             return false;
//         }

//         HashSet<Integer> window = new HashSet<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (i > k) {
//                 window.remove(nums[i - k - 1]);
//             }
//             if (!window.add(nums[i])) {
//                 return true;
//             }
//         }

//         return false;
    // }
    //brute force teime limit exceed
     public boolean containsNearbyDuplicate2(int[] nums, int k){
         if(k<0){
             return false;
         }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && j-i<=k){
                    return true;
                }
            }
        }
         
         return false;
     }
    
     public boolean containsNearbyDuplicate(int[] nums, int k){
         if(k<0){
             return false;
         }
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
        if(map.containsKey(nums[i])){
            if(Math.abs(i - map.get(nums[i])) <= k ){
                return true;
            }
        }
        map.put(nums[i],i);
    }
    return false;
     }
}



