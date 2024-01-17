import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int c=0;
        for(int i:arr){
            if(!map.containsKey(i)){
                c++;
            }
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        List<Integer> list =  map.values().stream().collect(Collectors.toList());
        Collections.sort(list);
        for(int i=1;i<list.size();i++){
            if(list.get(i)==list.get(i-1)){
                return false;
            }
            
        }
        return true;
    }
}