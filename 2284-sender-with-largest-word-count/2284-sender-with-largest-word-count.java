class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        int n= messages.length;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int wordC = messages[i].split(" ").length;
            map.put(senders[i], map.getOrDefault(senders[i], 0)+wordC);
        }
        PriorityQueue<String> x = new PriorityQueue<>((a,b) -> {
            int fr = map.get(b) - map.get(a);
            if(fr==0){
                return b.compareTo(a);
            }
            return fr;
        });
        
        for(String user:map.keySet()){
            x.offer(user);
        }
        
        return x.poll();
    }
}