class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue()); 
        
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            q.add(entry);
        }
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
           Map.Entry<Character, Integer> x = q.poll();
           int count = map.get(x.getKey());
            String key = x.getKey() +"";
           sb.append(key.repeat(count));
        }
        
        return sb.toString();
    }
}