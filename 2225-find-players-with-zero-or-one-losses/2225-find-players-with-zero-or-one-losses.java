class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
      
        Map<Integer,Integer> winner = new HashMap<>();
          Map<Integer,Integer> loser = new HashMap<>();
        for(int[] row:matches){
            int w = row[0];
            int l = row[1];
            if(winner.containsKey(l)){
                winner.remove(l);
                // continue;
            }if(!loser.containsKey(w)){
                   winner.put(w, 1);
            }
            loser.put(l, loser.getOrDefault(l,0)+1);    
        }
        
        List<Integer> wx = winner.keySet().stream().collect(Collectors.toList());
        
        List<Integer> lx = new ArrayList();
        
        for(Map.Entry<Integer, Integer> entry: loser.entrySet()){
            if(entry.getValue()==1){
                lx.add(entry.getKey());
            }
        }
        Collections.sort(wx);
        Collections.sort(lx);
        List<List<Integer>> result = new ArrayList<>();
        result.add(wx);
        result.add(lx);
        return result;
        
        
        
        
        
    }
}