class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        int[] arr = new int[101];
        
        HashMap<Integer,Integer> map= new HashMap<>();
        
        int remaining =0;
        int pairs=0;
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Integer i: map.values()){
        
//              if(i%2==0){
//                 pairs+=i/2;
                
//             }
            if(i%2!=0){
                remaining++;
                
            }
            pairs+=i/2;
        }
        
        return new int[]{pairs, remaining};
        
    }
}