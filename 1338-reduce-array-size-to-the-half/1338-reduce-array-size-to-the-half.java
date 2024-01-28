class Solution {
    public int minSetSize(int[] arr) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        if(map.size()==1) return 1;
         PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->(b-a));
        for(int value:map.values()){
            q.offer(value);
        }
        
        int count=0;
        int sum=arr.length/2;
        while(!q.isEmpty() && sum > 0){
            
            int freq = q.poll();
            sum-=freq;
            
            // if(sum <= arr.length/2){
                count++;
            // }
            // map.put(x, 0);
        }
        return count;
    }
}