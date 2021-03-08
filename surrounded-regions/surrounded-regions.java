class Solution {
    public void solve(char[][] board) {
        if(board.length==0 || board[0].length==0)return;
        int rows=board.length;
        int columns=board[0].length;
        
        for(int i=0;i<rows;i++){
            if(board[i][0]=='O')connected(i,0,board);
            if(board[i][columns-1]=='O')connected(i,columns-1,board);
        }
        
        for(int j=0;j<columns;j++){
            if(board[0][j]=='O')connected(0,j,board);
            if(board[rows-1][j]=='O')connected(rows-1,j,board);
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(board[i][j]=='A')board[i][j]='O';
                else if(board[i][j]=='O')board[i][j]='X';
            }
        }
        
    }
    
    public void connected(int i,int j,char[][] board){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length)return;
        
        if(board[i][j]=='O')board[i][j]='A';
        if(j-1>=0 && board[i][j-1]=='O')connected(i,j-1,board);
        if(i-1>=0 && board[i-1][j]=='O')connected(i-1,j,board);
        if(j+1<=board[0].length-1 && board[i][j+1]=='O')connected(i,j+1,board);
        if(i+1<=board.length-1 && board[i+1][j]=='O')connected(i+1,j,board);
    }
    
    
    
}