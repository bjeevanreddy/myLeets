class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits==null|| digits.isEmpty()){
            return new ArrayList<>();
        }
        HashMap<Character, String> keys= new HashMap<>();
            keys.put('2',"abc");
            keys.put('3',"def");
            keys.put('4',"ghi");
            keys.put('5',"jkl");
            keys.put('6',"mno");
            keys.put('7',"pqrs");
            keys.put('8',"tuv");
            keys.put('9',"wxyz");
        
        List<String> res= new ArrayList<>();
        
        helper(digits, keys, res, "", 0);
        return res;
    }
    
    static void helper(String digits, HashMap<Character, String> keys, List<String> res,String curr,int start){
        
        if(start==digits.length()){
            res.add(curr);
            return;
        }
        char c = digits.charAt(start);
        String button= keys.get(c);
        
        for(int i=0;i<button.length();i++){
             curr+=button.charAt(i);
             helper(digits,keys,res,curr,start+1);
             curr =curr.substring(0,curr.length()-1); 
        }  
    }
}