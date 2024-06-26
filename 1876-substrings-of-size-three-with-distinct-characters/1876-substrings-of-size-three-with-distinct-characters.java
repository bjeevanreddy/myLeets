class Solution {
    public int countGoodSubstrings1(String s) {
        
        int count = 0 ;
        for(int i=0;i<s.length()-2;i++){
            count += hasUnique(s.substring(i,i+3)) ? 1 : 0;  
        }
        
        return count;
        
    }
    
    
     public int countGoodSubstrings(String s) {
        int i=0,j=0,count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(j<s.length())
        {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1<3)
            {
                j++;
            }else if(j-i+1==3)
            {
                if(map.size()==3)
                {
                    count++;
                    //System.out.println(map);
                }
                int val=map.get(s.charAt(i));
                val=val-1;
                if(val==0){
                    map.remove(s.charAt(i));
                }else{
                    map.put(s.charAt(i),val);
                }
                
                i++;
                j++;
            }
        }
        return count;
    }
    
    static boolean hasUnique(String x){
        Set<Character> set = new HashSet<>();
        
        for(Character i:x.toCharArray()){
            set.add(i);
        }
        
     return set.size() == x.length();
    }
}