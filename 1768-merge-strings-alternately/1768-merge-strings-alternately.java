class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        
        int l = word1.length();
        int s = word2.length();
        int i=0;int j=0;
        StringBuilder sb = new StringBuilder();
        while(i < l || j< s){
            if(i<l) sb.append(word1.charAt(i));
            if(j<s) sb.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<l){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<s){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
        
    }
}