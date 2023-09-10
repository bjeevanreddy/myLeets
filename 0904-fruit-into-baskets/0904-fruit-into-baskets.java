class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int start = 0;
        int max = 0;
   
        for(int end =0;end<fruits.length;end++)
        {
            int curr = map.getOrDefault(fruits[end],0);
            
            map.put(fruits[end],curr+1);
            while(map.size()>2){
                
                int prev = map.get(fruits[start]);
                if(prev==1){
                    map.remove(fruits[start]);
                }else{
                    map.put(fruits[start],prev-1);
                    
                } 
                 start++;
            }
            max= Math.max(max, end-start+1);
           
            
        }        
        return max;
    }
}