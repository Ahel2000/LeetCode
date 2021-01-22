class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && possible(board,0,i,j,word))return true;
            }
        }
        
        return false;
    }
    
    public boolean possible(char[][] board,int index,int i,int j,String word){
        if(index==word.length())return true;
        
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(index)!=board[i][j]){
            return false;
        }
        
        char temp=board[i][j];
        board[i][j]=' ';
        boolean found=possible(board,index+1,i,j+1,word) ||
                        possible(board,index+1,i,j-1,word)||
                        possible(board,index+1,i-1,j,word)||
                        possible(board,index+1,i+1,j,word);
        board[i][j]=temp;
        return found;
    }
}
