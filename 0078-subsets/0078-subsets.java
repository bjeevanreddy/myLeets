class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> reuslt =  new ArrayList<List<Integer>>();
          subSeq(nums,reuslt,0,new ArrayList<>());
          return reuslt;
    }


    public static void helper(int[] arr, int s, List<List<Integer>> res,  List<Integer> curr){
        res.add(new ArrayList<>(curr));
        for(int i=s;i<arr.length;i++){
            curr.add(arr[i]);
            helper(arr,i+1,res,curr);
            curr.remove(curr.size()-1);
        }
    }
    
    public static void subSeq(int[] nums, List<List<Integer>> res, int start, List<Integer> temp){
        if(start>=nums.length){
              res.add(new ArrayList<>(temp)); 
              return;
            }
        temp.add(nums[start]);
        subSeq(nums, res, start+1, temp);
        temp.remove(temp.size()-1);
        subSeq(nums, res,start+1, temp);
    }
}