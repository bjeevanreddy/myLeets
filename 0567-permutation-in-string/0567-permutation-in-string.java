class Solution {
    
    boolean isMatch(int[]  a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        
        
      if(s1.length()>s2.length()){
          return false;
      }
        
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
        
        for(int i=0;i<s1.length();i++){
            fre1[s1.charAt(i) - 'a']++;
            fre2[s2.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<s2.length()-s1.length();i++){
            if(isMatch(fre1,fre2)){
                return true;
            }
            fre2[s2.charAt(i)-'a']--;
            fre2[s2.charAt(i+s1.length()) - 'a']++;
        }
        
        return isMatch(fre1,fre2);
    }
}