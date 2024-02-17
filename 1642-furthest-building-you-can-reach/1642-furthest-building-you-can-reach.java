class Solution {
//     public int furthestBuilding1(int[] heights, int bricks, int ladders) {
//         int i=0;
//         int j=i+1;
        
//         while(i<heights.length-1){
            
//             if(heights[j]<=heights[i]){
//                 i++;
//                 j++;continue;
//             }else{
                
//                 int needed = heights[j]-heights[i];
//                 if(needed < bricks){
//                     i++;
//                     j++;
//                     bricks-=needed;
//                 }else if(ladders >0 ) {
//                     i++;
//                     j++;
//                     ladders--;
//                 }else{
//                     break;
//                 }
//             }
//         }
//         return i;
        
//     }
    
    public int furthestBuilding(int[] heights, int bricks, int ladders){
        PriorityQueue<Integer> pq = new PriorityQueue<> ((a,b) -> Integer.compare(a,b));
        for (int i= 0; i< heights.length - 1; i++) {
            int diff =heights[i+1] - heights[i];
            if (diff <= 0) {
                continue;
            }
            pq.add(diff);
            if (pq.size() <= ladders) {
                continue;
            }
            bricks -= pq.remove();
            if (bricks < 0) {
                return i;
            }
        }
        return heights.length-1;
    }
}