class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            q.add(entry);
        }
        // System.out.println(q);
        List<Integer> t = new ArrayList<>();
        while(!q.isEmpty() && k>0 ){
            int key = q.poll().getKey();
            t.add(key);
            k--;
        }
        // System.out.println(t);
        int[] arr = new int[t.size()];
        int start=0;
        for(Integer i:t){
            arr[start++] = i.intValue();
        }
        return arr;
       
    }
}