class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
     
        PriorityQueue<Map.Entry<Integer,Integer>> q= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        
        q.addAll(map.entrySet());
          
        while(!q.isEmpty()){
            Map.Entry<Integer,Integer> x = q.poll();
             System.out.println(x);
            if(Math.floor(nums.length/3)< x.getValue()){
                result.add(x.getKey());
            }
        }
        
        return result;
        
        
    }
}