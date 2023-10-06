class Solution {
    public List<Integer> majorityElement1(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> q= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        q.addAll(map.entrySet()); 
        while(!q.isEmpty()){
            Map.Entry<Integer,Integer> x = q.poll();
            if(Math.floor(nums.length/3)< x.getValue()){
                result.add(x.getKey());
            }
        }
        return result;   
    }
    
     public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        double macVal =  Math.floor(nums.length/3);
        if(nums.length==1){
             result.add(nums[0]);
             return result;
         } 
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.containsKey(i) && map.get(i)!=-1){
                if(map.get(i)>macVal){
                    map.put(i,-1);
                    result.add(i);
                }
            }
        }
        return result;   
    }
}