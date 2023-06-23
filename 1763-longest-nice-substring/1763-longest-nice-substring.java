class Solution {
    public String longestNiceSubstring(String s) {
        
        char[] chars = s.toCharArray();
      
        Set<Character> set = new HashSet<>();
        
        for(char c:chars){
            set.add(c);
        }

        for(int i=0;i<chars.length;i++){
            
            if(set.contains(Character.toLowerCase(chars[i])) && set.contains(Character.toUpperCase(chars[i]))){
                continue;
            }
            
            String s1 = longestNiceSubstring(s.substring(0,i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            
            return s1.length()>=s2.length() ? s1 : s2;
        }
        
        return s;
    }
}
           
    