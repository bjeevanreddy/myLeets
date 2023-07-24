class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            int[][] arr= new int[1][2];
            arr[0][0]=newInterval[0];
            arr[0][1]=newInterval[1];
          return arr;
        }
        LinkedList<int[]> result = new LinkedList<>();
        LinkedList<int[]> temp = new LinkedList<>();
      
        int index=-1;
        for(int i=0;i<intervals.length;i++){
            
            if(newInterval[0]> intervals[i][0]){
                index= i;
            }
            temp.add(intervals[i]);
        }
        if(index==-1){
            temp.add(0,newInterval);
        } else{
            temp.add(index+1, newInterval);
        } 
        int start= temp.get(0)[0];
        int end=temp.get(0)[1];
        for(int i=1;i<temp.size();i++){
            int[] current = temp.get(i);
            
            if(current[0]<= end){
                
                end = Math.max(end, current[1]);
            }
            else{
                result.add(new int[]{start,end});
                start = current[0];
                end = current[1];
            }
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
    }
}