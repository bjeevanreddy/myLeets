class Solution {
    public int majorityElement1(int[] nums) {

        // USing hashMap
        // whenever there is sum diff and count like that think of hashmaps

        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i:nums){
        //    map.put(i, map.getOrDefault(i, 0) + 1);
        // }

        // for(int key: map.keySet()){
        //     int val = map.get(key);
        //     if(val > nums.length/2){
        //         return key;
        //     }
        // }

        // return -1;

        //Using moore's voting algorithm'

        int count=0;

        int val = 0;

        for(int i=0;i<nums.length;i++){
           if(count==0){
               val = nums[i];
               count=1;
           }
           else if(val == nums[i]){
               count++;
           }
           else{
               count--;
           }
        }
        int c=0;
        for(int i:nums){
           if(i==val){
               c++;
           }
        }
        if(c>(nums.length/2)){
            return val;
        }
        return -1;
    }
    
     public int majorityElement(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
         int target = (int)Math.floor(nums.length/2);
         for(int i:nums){
             map.put(i, map.getOrDefault(i,0)+1);
         }
         
         for(Integer i:map.keySet()){
             if(map.get(i)>target){
                 return i;
             }
         }
         
         return 0;
     }
}