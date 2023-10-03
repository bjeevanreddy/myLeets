class Solution {
    // public int numIdenticalPairs(int[] nums) {
    //     int count=0;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i] == nums[j]){
    //                 count++;
    //             }
    //         }
    //     }

    //     return count;
    // }

    public int numIdenticalPairs1(int[] nums) {
        // int count=0;
        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }else{
        //         map.put(nums[i],1);
        //     }
        // }

        //  for (Map.Entry<Integer, Integer> set :
        //      map.entrySet()) {
        //          count = count + ((set.getValue() * (set.getValue()-1)) / 2);
        //      }
        

        // return count;
        HashMap<Integer,Integer>mp=new HashMap<>();

    int count=0;

    for(int i=0;i<nums.length;i++){

    if(!mp.containsKey(nums[i])){
        mp.put(nums[i],1);
    }
    else{
        count+=mp.get(nums[i]);
        mp.put(nums[i],mp.get(nums[i])+1);
    }

    }

    return count;
    }

    public int numIdenticalPairs(int[] nums){
        int c=0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
        }
        return c;
    }
    

}