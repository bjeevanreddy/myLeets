class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> reuslt =  new ArrayList<List<Integer>>();
        Arrays.sort(nums);
          helper(nums,0,reuslt,new ArrayList<>());
          return reuslt;
    }


    public static void helper(int[] arr, int s, List<List<Integer>> res,  List<Integer> curr){
    
        if(!res.contains(curr)){
             res.add(new ArrayList<>(curr));
        }
       
        for(int i=s;i<arr.length;i++){
            curr.add(arr[i]);
            helper(arr,i+1,res,curr);
            curr.remove(curr.size()-1);
        }
    }
}