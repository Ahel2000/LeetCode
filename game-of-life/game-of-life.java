class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        int [][] answer=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x=0;
                if(j+1<n){
                    if(i-1>=0 && board[i-1][j+1]==1)x++;
                    if(board[i][j+1]==1)x++;
                    if(i+1<m && board[i+1][j+1]==1)x++;
                } 
                if(j-1>=0){
                    if(i-1>=0 && board[i-1][j-1]==1)x++;
                    if(board[i][j-1]==1)x++;
                    if(i+1<m && board[i+1][j-1]==1)x++;
                }
                if(i-1>=0 && board[i-1][j]==1)x++;
                if(i+1<m && board[i+1][j]==1)x++;
                
                if(x<2 && board[i][j]==1)answer[i][j]=0;
                if((x==2 || x==3) && board[i][j]==1)answer[i][j]=1;
                if(x>3 && board[i][j]==1)answer[i][j]=0;
                if(x==3 && board[i][j]==0)answer[i][j]=1;
           } 
            
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)board[i][j]=answer[i][j];
        }
    }
}
