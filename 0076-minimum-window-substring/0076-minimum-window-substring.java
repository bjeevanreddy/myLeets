class Solution {
    public String minWindow1(String s, String t) {
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        if(s.length()<t.length()) return "";
        if (t.trim().equals("")) return "";
        if(s.equals(t)) return s;
        for(char c: t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(tMap.get(c),0)+1);
            sMap.put(c, 0);
        }
        
          
        // int count=tMap.size();
        int start=0;
        int minstart=0;
        int min = Integer.MAX_VALUE;
        int minend=0;
        String minStr= "";
        int counter=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            // if(sMap.containsKey(c) && tMap.containsKey(c)){
            //    counter++;
            // }
            
           if(sMap.containsKey(c)){
               sMap.put(c, sMap.get(c)+1);
               
            }
           }
            int i=0;
            while(counter==t.length()){
                if(i-start+1< min){
                    minstart = start;
                    minend = i;
                    // minStr= s.substring(start, i-start+1);
                    min = i-start+1;
                }
                    char first = s.charAt(start);
                    if(sMap.containsKey(first)){
                        sMap.put(first, sMap.get(first)-1);
                    if (sMap.get(first) < tMap.get(first))  counter -= 1;
                    }
                    start++; 
            }
        
        return min==Integer.MAX_VALUE ? "" : s.substring(minstart, minend+1);

        }

    public boolean containsAll(String s, String t){
        for(char c:t.toCharArray()){
            if(s.indexOf(c)==-1){
                return false;
            }
        }
        return true;
    }

     public String minWindow(String s, String t) {
         StringBuilder res = new StringBuilder();
         HashMap<Character, Integer> map = new HashMap<>();
         HashMap<Character, Integer> maps = new HashMap<>();
         char[] sc = t.toCharArray();
         for(char c: sc){
             map.put(c, map.getOrDefault(c,0)+1);
         }
         int start=0;
         int end=0;
         int min = Integer.MAX_VALUE;
         if(t.length()>s.length()) return "";
         if(t.equals(s)) return s;
         // String res = "";
         int count=0;
         for(int i=0;i<s.length();i++){
             char ch = s.charAt(i);
            // res.append(s.charAt(i));
              maps.put(ch, maps.getOrDefault(ch,0)+1);
             if(map.containsKey(ch) && maps.get(ch)<=map.get(ch)){
                count++;
             }
              while(count==t.length()){
                  if(i-start+1 <= min ){
                        min =  i-start+1;
                        end=i;
                  }
                  
                  
                  if(maps.get(s.charAt(start))==1){
                          maps.remove(s.charAt(start));
                   }
                    else{
                        maps.put(s.charAt(start), maps.get(s.charAt(start))-1);
                  }
                  // res = new StringBuilder(res.substring(1));
                  
                  if(map.containsKey(s.charAt(start)) &&maps.getOrDefault(s.charAt(start),0)< map.get(s.charAt(start))){
                      count--;
                  }
                  start++;
              }
         }
         return min==Integer.MAX_VALUE? "" : s.substring(end-min+1, end+1);    
     }

    boolean isMatch(StringBuilder s, String t){
        int[] charCount = new int[256];

    // Count characters in string s
    for (char ch : s.toString().toCharArray()) {
        charCount[ch]++;
    }

    // Check if all characters in string t are present in string s
    for (char ch : t.toCharArray()) {
        charCount[ch]--;

        // If the count becomes negative, or the character is not present in s, return false
        if (charCount[ch] < 0) {
            return false;
        }
    }
    return true;
    }
}