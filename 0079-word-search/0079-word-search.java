class Solution {
    public boolean exist(char[][] board, String word) {
        
        
        int n = board.length;
        int m = board[0].length;
        boolean[][] path = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if( board[i][j]==word.charAt(0) && search(board, i,j,word, n,m, path)){
                   return true;
               }
            }
        }
        
        return false;
    }
    
    boolean search(char[][] board, int r, int c, String word,int n, int m, boolean[][] path){
        if(word.isEmpty()){
            return true;
        }
        // System.out.println(word);
        if(r>=n || c>=m || c<0 || r<0 || board[r][c]!=word.charAt(0) || path[r][c]){
            return false;
        }
        
        path[r][c]=true;
        boolean x=false;boolean y=false;boolean z=false;
        // for(int i=-1;i<=1;i++){
         x= search(board, r, c+1, word.substring(1), n, m, path) ;
          y =  search(board, r+1,c, word.substring(1), n, m,path) ;
           z = search(board, r,c-1, word.substring(1), n, m, path);
        boolean p = search(board, r-1,c, word.substring(1), n, m, path);
        // }
        
        path[r][c]=false;
        return x||y||z||p;
       
        
    }
}