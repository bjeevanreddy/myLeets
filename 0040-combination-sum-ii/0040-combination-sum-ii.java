class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       int len = candidates.length;
        Arrays.sort(candidates);
        Set<List<Integer>> res = new HashSet<>();
        helper(candidates, 0, target, res, new ArrayList<>());
        return new ArrayList<>(res);
    }
    
     void helper(int[] candidates, int start, int t,  Set<List<Integer>> res, List<Integer> temp){
         
          if(t==0){
             res.add(new ArrayList<>(temp));
             return;
         }
         if(start>=candidates.length || t<0){
             return;
         }
        
        // ÷÷f(candidates[start]>t){
         //      helper(candidates, start+1, t ,res, temp);
         // }else{
       
        temp.add(candidates[start]);
        helper(candidates, start+1, t-candidates[start],res, temp);
        temp.remove(temp.size()-1);
         while(start<candidates.length-1 && candidates[start]==candidates[start+1]){
             start++;
         }
        helper(candidates, start+1, t ,res, temp);
         // }
       
     }
}