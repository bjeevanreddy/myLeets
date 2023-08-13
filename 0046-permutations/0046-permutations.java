class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res= new ArrayList<>();
        
        helper(nums, res, new ArrayList<>());
        
        return res;
        
    }
    
    static void helper(int[] nums, List<List<Integer>> res, List<Integer> curr ){
        
        
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            // swap(nums,i,start);
            if(!curr.contains(nums[i])){
                curr.add(nums[i]);
            
            helper(nums,res,curr);
           
            
            curr.remove(curr.size()-1);
            }
            
            
        }
    }
    
    static void swap(int[] nums, int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j]=t;
    }
}