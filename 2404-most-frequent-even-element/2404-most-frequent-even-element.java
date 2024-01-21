class Solution {
    public int mostFrequentEven1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums){
            if(i%2==0){
                map.put(i, map.getOrDefault(i,0)+1);
            }
        }
        
             PriorityQueue<Map.Entry<Integer,Integer>> x = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
          
            x.offer(e);
        }
        
        
          System.out.println(x);
       
        int smaller=-1;
            if(x.size()==1){
                return x.poll().getKey();
            }
        while(!x.isEmpty()){
            var y = x.poll();
            var z = x.poll();
            if(y.getValue() > z.getValue()){
                smaller =  y.getKey();
                break;
            }else{
               smaller = Math.min(y.getKey(), z.getKey()); 
               // y = x.poll();
            }
        }
        return smaller;
        // else{
        //     return -1;
        // }
        
       
        // map.entrySet().sort((a,b)-> b.getValue()-a.getValue());
        
    }
    
    public int mostFrequentEven(int[] nums) {
        
        int n= nums.length;
        int val=-1;
        int maxFreq= -1;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                int freq = map.getOrDefault(i, 0)+1;
                map.put(i, freq);
                if(freq>=maxFreq){
                    val = freq==maxFreq ? Math.min(i, val) : i;
                    maxFreq=freq;
                    
                }
            }
        }
        
        // PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((x,y) =>{
        //     int a = x.getValue();
        //     int b = y.getValue();
        //     if(b-a >0){
        //         return 1;
        //     }
        //     else if(b-a <0){
        //         return -1;
        //     }
        //     else{
        //         if(x.getKey()<y.getKey()){
        //             return x;
        //         }else{
        //             return y;
        //         }
        //     }
        //     }
        // });
        
        return val;
    }
}