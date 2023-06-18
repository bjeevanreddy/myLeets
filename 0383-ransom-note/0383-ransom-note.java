class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        
        int r = 0;
        int m=0;
        
        if(ransomNote==null || magazine==null){
            return false;
        }
        int[] arr = new int[26];
        // while(r<ransomNote.length() || m<magazine.length() || r<=m){
            
            while(r<ransomNote.length()){
                arr[ransomNote.charAt(r)-'a']++;
                r++;
            }
            while(m<magazine.length()){
                arr[magazine.charAt(m)-'a']--;
                m++;
            }
        
        for(int i:arr) {
            if(i > 0) 
                return false;
        }
        return true;
    }
}