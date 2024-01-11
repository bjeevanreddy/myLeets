class Solution {
     List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(n<=45) {
            helper( k, n, 0,0, new ArrayList<>());
        }
        return result;
    }
    
    
     void helper( int k, int n, int start,int sum, List<Integer> temp){
        
        if(temp.size()==k && sum==n){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        if(temp.size()==k){
            return;
        }
         
         if((temp.size()<k && sum>n)) return;
        
        if(start>8) return;
        temp.add(start+1);
        helper(k, n, start+1, sum+start+1, temp);
        temp.remove(temp.size()-1);
        helper(k, n, start+1, sum, temp);
    }
}