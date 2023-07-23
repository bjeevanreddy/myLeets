class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        
        LinkedList<int[]> result = new LinkedList<>();
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            int[] current = intervals[i];
            
            if(current[0]<=end){
                end = Math.max(current[1],end);
            }else{
                result.add(new int[]{start, end});
                start = current[0];
                end = current[1];
            }
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
    }
}