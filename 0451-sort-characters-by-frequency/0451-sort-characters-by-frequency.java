class Solution {
    public String frequencySort1(String s) {
        
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
    
     public String frequencySort(String s) {
         HashMap<Character, Integer> x= new HashMap<>();
         
         char[] sc =s.toCharArray();
         for(char c:sc){
             x.put(c, x.getOrDefault(c,0)+1);
         }
         
         PriorityQueue<Character> q = new PriorityQueue<>((a,b) -> {
             int count1 = x.get(a);
             int count2 = x.get(b);
             
             int freq = count2-count1;
             return freq;
         });
         
         for(Character c: x.keySet()){
             q.offer(c);
         }
         
         StringBuilder sb = new StringBuilder();
         while(!q.isEmpty()){
             Character c = q.poll();
             int cn=x.get(c);
             while(cn>0){
                 sb.append(c);
                 cn--;
             }
         }
         return sb.toString();
     }
}