class Solution {
    public int lastStoneWeight(int[] stones) {
       
      // 1 1 2 4 7 8
      // 1 2
      // 0 2 1 -- 0 1 2
      // 0 1
      // 1
         Arrays.sort(stones);
        List<Integer> a= new ArrayList<>();
         for(int i:stones){
             a.add(i);
         }
        
        int j=a.size();
        int i= a.size()-1;
        while(a.size()>1){
            
              int val1 = a.get(a.size()-1);
              int val2 = a.get(a.size()-2);
               a.remove(a.size()-1);
               a.remove(a.size()-1);
                
               a.add(Math.abs(val1-val2));
               Collections.sort(a);
                // j=a.size();
        }
            
        if(a.size()==1){
                   return a.get(0);
               }else{
                   return 0;
        }
        }
}