class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        
        List<List<Integer>> res= new ArrayList<>();
        helper(n,k,res, new ArrayList<>());
        return res;
    }
    
    public void helper(int n , int k , List<List<Integer>> ans , List<Integer> temp){
        if(k == 0)
        {
            ans.add(new ArrayList(temp));
            return;
        }
        if(n == 0)
            return;
        
//         We are not taking n
        helper(n-1, k, ans,temp);
        
//         We are taking n
        temp.add(n);
        helper(n-1,k-1,ans,temp);
        temp.remove(temp.size()-1);
    }
}