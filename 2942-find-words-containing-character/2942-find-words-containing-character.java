class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res= new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            String s = words[i];
            if(s.contains(x+"")){
                res.add(i);
            }
        }
        return res;
    }
}