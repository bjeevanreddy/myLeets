class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        int f = word1.length;
        int i=0;
        StringBuilder sb = new StringBuilder();
         int j=0;
        StringBuilder sb1 = new StringBuilder();
        
        while(i<f){
            sb.append(word1[i]);
            i++;
        }
        
        while(j<word2.length){
            sb1.append(word2[j]);
            j++;
        }
        
        return sb.toString().equals(sb1.toString());
    }
}