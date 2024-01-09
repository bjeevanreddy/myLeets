class Solution {
    public int similarPairs(String[] words) {
        
        int count=0;
        for(int i=0;i<words.length-1;i++){
            String w = words[i];
            for(int j=i+1;j<words.length;j++){
                String w2 = words[j];
                count+= pairOrNot(w, w2); 
            }
        }
        return count;
    }
    
    static int pairOrNot(String x, String y){
        
        HashSet<Character> set1 = new HashSet<>();
        for(char c : x.toCharArray()) {
            set1.add(c);
        }
        
        HashSet<Character> set2 = new HashSet<>();
        for(char c : y.toCharArray()){
            set2.add(c);
        } 
        
        return set1.equals(set2) ? 1 : 0;
    }
}