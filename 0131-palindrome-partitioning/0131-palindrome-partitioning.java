class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res= new ArrayList<>();
        if(s.length()==0){
            return res;
        }
        
        helper(s, res,new ArrayList<>());
        
        return res;
    }
    
    static void helper(String s, List<List<String>> res, List<String> curr){
        
        if(s.length()==0){
            res.add(new ArrayList<String>(curr));
            return;
        }
        
        for(int i=0;i<s.length();i++){
            
            if(palin(s,0,i)){
                
                curr.add(s.substring(0,i+1));
                
                helper(s.substring(i+1),res,curr);
                
                curr.remove(curr.size()-1);
            }
        }
    }
    
    static boolean palin(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        
        return true;
    }
}