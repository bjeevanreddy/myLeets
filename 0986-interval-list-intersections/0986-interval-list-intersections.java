class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        if(A== null || A.length == 0 && B == null || B.length == 0)
            return new int[0][0];
        int i=0, j=0;
        ArrayList<int[]> res = new ArrayList<>();
        while(i<A.length && j<B.length) {
            int max = Math.max(A[i][0], B[j][0]);
            int min = Math.min(A[i][1], B[j][1]);
            if(max <= min) {
                res.add(new int[]{max, min});
            }
            if(A[i][1] < B[j][1]){
                i++;
            }
            else{
                j++;
            }
        }
            int[][] result = new int[res.size()][2];
        for( i=0;i<res.size();i++){
            result[i] = res.get(i);
        }
        return result;
    }
    }