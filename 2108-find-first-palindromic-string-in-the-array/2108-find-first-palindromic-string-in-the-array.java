class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s:words){
            if(s.charAt(0)==s.charAt(s.length()-1)){
                if(checkp(s)){
                    return s;
                }
            }
        }
        
        return "";
    }
    
    boolean checkp(String s){
        
        int l=1;
        int e=s.length()-2;
        
        while(l<s.length()&& l<e && e>0){
            if(s.charAt(l)!=s.charAt(e)){
                return false;
            }
            l++;
            e--;
        }
        return true;
    }
}