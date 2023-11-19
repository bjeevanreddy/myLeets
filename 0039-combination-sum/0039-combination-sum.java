class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
     helper(candidates, 0, target, res, new ArrayList<>());
        return res;
    }
   
    void helper(int[] candidates, int start, int t,  List<List<Integer>> res, List<Integer> temp){
         
         if(start>=candidates.length || t<0){
             return;
         }
         
         if(t==0){
             res.add(new ArrayList<>(temp));
             return;
         }
         
       
        // if(candidates[start]>t){
        //      helper(candidates, start+1, t,res, temp);
        // }
        temp.add(candidates[start]);
        helper(candidates, start, t-candidates[start],res, temp);
         temp.remove(temp.size()-1);
        helper(candidates, start+1, t ,res, temp);  
       
     }
    
}