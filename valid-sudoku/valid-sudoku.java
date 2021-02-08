class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Integer>[] rows=new HashMap[9];
        HashMap<Integer,Integer>[] cols=new HashMap[9];
        HashMap<Integer,Integer>[] boxes=new HashMap[9];
        
        for(int i=0;i<9;i++){
            rows[i]=new HashMap<>();
            cols[i]=new HashMap<>();
            boxes[i]=new HashMap<>();
        }
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int box=(i/3)*3+j/3;
                char num=board[i][j];
                if(num!='.'){
                    if(!rows[i].containsKey(num-'0') && !cols[j].containsKey(num-'0')
                       && !boxes[box].containsKey(num-'0')){
                        rows[i].put(num-'0',1);
                        cols[j].put(num-'0',1);
                        boxes[box].put(num-'0',1);
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}