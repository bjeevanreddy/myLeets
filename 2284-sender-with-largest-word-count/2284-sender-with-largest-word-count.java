class Solution {
    
    //using priorty queuue
    public String largestWordCount1(String[] messages, String[] senders) {
        
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
    
    // only hashMap
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> hm=new HashMap<>();
		
        int max=0;
        String name="";
        for(int i=0;i<messages.length;i++){
            String[] words=messages[i].split(" ");
            
            int freq=hm.getOrDefault(senders[i],0)+words.length;
            hm.put(senders[i],freq);
            
            if(hm.get(senders[i])>max){
                max=hm.get(senders[i]);
                name=senders[i];
            }
            else if(hm.get(senders[i])==max && name.compareTo(senders[i])<0){
                name=senders[i];
            } 
        }
        
        return name;
    }
}