class Solution {
    public int firstUniqChar1(String s) {
        
        
        int b=0;
        int[] arr=new int[26];
        
        Map<Character,Integer> map = new HashMap<>();
        
        while(b<s.length()){
            
            map.put(s.charAt(b), map.getOrDefault(s.charAt(b),0)+1);
            b++;
        }
    
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    
    
    //using arra hasing
    
     public int firstUniqChar(String s) {
         
         int[] arr = new int[26];
         
         for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
             arr[c-'a']++;
         }
         
          for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
             if(arr[c-'a'] ==1){
                 return i;
             }
         }
         
         return -1;
     }
}