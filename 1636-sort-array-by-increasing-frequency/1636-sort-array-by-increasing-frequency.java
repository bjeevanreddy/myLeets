class Solution {
    public int[] frequencySort(int[] nums) {
         Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c = nums[i];
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
          PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a,b) -> {
              if(a.getValue()<b.getValue()){
                  return -1;
              }else if(a.getValue()>b.getValue()){
                  return 1;
              }else{
                  return Integer.compare(b.getKey(), a.getKey());
              }
              }); 
        
         for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            q.offer(entry);
        }
       int[] arr = new int[nums.length];
        int k=0;
        while(!q.isEmpty()){
           Map.Entry<Integer, Integer> x = q.poll();
           int count = map.get(x.getKey());
            int key = x.getKey();
           while(count-- > 0){
               arr[k++]= key;
           }
        }
        
        return arr;
    }
}