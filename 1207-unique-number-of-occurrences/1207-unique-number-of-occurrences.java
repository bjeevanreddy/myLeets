import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        Set<Integer> hashSet= new HashSet(map.values());
        return hashSet.size()==map.size();
//         List<Integer> list =  map.values().stream().collect(Collectors.toList());
//         Collections.sort(list);// nlogn
//         for(int i=1;i<list.size();i++){
//             if(list.get(i)==list.get(i-1)){
//                 return false;
//             }
            
//         }
//         return true;
    }
}