class Solution {
    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
     helper1(candidates, 0, target, res, new ArrayList<>());
        return res;
    }
   
    void helper1(int[] candidates, int start, int t,  List<List<Integer>> res, List<Integer> temp){
         
         if(start>=candidates.length || t<0){
             return;
         }
         
         if(t==0){
             res.add(new ArrayList<>(temp));
             return;
         }
        temp.add(candidates[start]);
        helper1(candidates, start, t-candidates[start],res, temp);
        temp.remove(temp.size()-1);
        helper1(candidates, start+1, t ,res, temp);  
       
     }
    
    
    //Pratcise
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(target==0) return null;
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, 0, new ArrayList<>(),target, result);
        return result;
     }
    
    static void helper(int[] cn, int start, List<Integer> temp, int target, List<List<Integer>> result){
        
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        if (start>=cn.length) return;
        
        if(target<0) return;
        
        temp.add(cn[start]);
        helper(cn, start, temp, target-cn[start], result);
         temp.remove(temp.size()-1);
        helper(cn, start+1, temp, target, result);
    }
    
    
    
    
}