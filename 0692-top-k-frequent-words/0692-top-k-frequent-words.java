class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String x : words){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,b) -> {
             int freqComparison = Integer.compare(b.getValue(), a.getValue());

            // If frequencies are the same, compare by lexical order
            if (freqComparison == 0) {
                return a.getKey().compareTo(b.getKey());
            }
            return freqComparison;
        });
        
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.offer(entry);
        }
        List<String> x = new ArrayList<>();
        while(k-- >0){
            x.add(pq.poll().getKey());
        }
        // Collections.sort(x, (a,b) -> b.compareTo(a));
        return x;
    }
}