class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        
        int n = board[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0 || j==0 || i==m-1 || j==n-1) && board[i][j] == 'O'){
                    dfs(board,i,j);
                }
            }
        }
        
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 if(board[i][j]=='V'){
                        board[i][j]= 'O';
                    }
                else if(board[i][j]=='O'){
                    board[i][j]= 'X';
                }
            }
         }
    }
        
    void dfs(char[][] board, int i,int j){
            if(i<0 || j<0 ||  j>=board[0].length
              || i>=board.length || board[i][j]=='X' || board[i][j]=='V' ){
                return;
            }
            board[i][j]= 'V';
            
            dfs(board, i-1,j);
            dfs(board, i+1,j);
            dfs(board,i,j+1);
            dfs(board, i,j-1);
        }
    }