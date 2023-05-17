class Solution {
    
     boolean isMatch(int[]  a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        
        if(p.length()>s.length()){
            return new ArrayList<>();
        }
        
        List<Integer> res= new ArrayList<>();
        int[] f1=new int[26];
        int[] f2=new int[26];
      
        for(int i=0;i<p.length();i++){
            f1[p.charAt(i)-'a']++;
             f2[s.charAt(i)-'a']++;  
        }
        
          int i=0;
        
        for(;i<s.length()-p.length();i++){
            if(isMatch(f1,f2)){
                res.add(i);
            }
            
            f2[s.charAt(i)-'a']--;
            f2[s.charAt(i+ p.length()) - 'a']++;
        }
         
        if(isMatch(f1,f2)){
            res.add(i);
        }
        return res;
        
    }
}