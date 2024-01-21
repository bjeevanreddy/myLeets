class Solution {
    public int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public int findKthLargest(int[] nums, int k) {
       
        PriorityQueue<Integer> x = new PriorityQueue<>(k+1);
        
        for(int c : nums){
            x.offer(c);
            if(x.size()>k){
                x.poll();
            }
        }
      
        return x.poll();
    }
     
}