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
    
     public int firstUniqChar2(String s) {
         
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
    
      public int firstUniqChar(String s) {
          int[] arr = new int[26];
          char sc[] = s.toCharArray();
          for(char c : sc){
              arr[c-'a']++ ;
          }
          
          for(int t=0;t<sc.length;t++){
              if(arr[sc[t]-'a']==1){
                  return t;
              }
          }
          return -1;
      }
}