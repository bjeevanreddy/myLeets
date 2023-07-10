class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        if(s==null || s.length()<10){
            return new ArrayList<>();
        }
        int l=0;
        int e=10;
    HashSet<String> set = new HashSet<>();
        Set<String> res= new HashSet<>();
        while(e<=s.length()){
            String seq = s.substring(l,e);
            
            if(set.contains(seq)){
                res.add(seq);
            }
            
            set.add(seq);
            e++;
            l++;
            
            
        }
        
        return new ArrayList<>(res);
    }
}