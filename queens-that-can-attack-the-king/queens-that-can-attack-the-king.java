class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int x = king[0];
        int y = king[1];
        
        int[][] chess = new int[8][8];
        for(int[] queen : queens){
            chess[queen[0]][queen[1]] = 1;
        }
        
        List<List<Integer>> res = new ArrayList<>();
        for(int i=x+1;i<8;i++){
            if(chess[i][y] == 1){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(y);
                res.add(l);
                break;
            }
        }
        
        for(int i=x-1;i>=0;i--){
            if(chess[i][y] == 1){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(y);
                res.add(l);
                break;
            }
        }
        
        for(int i=y+1;i<8;i++){
            if(chess[x][i] == 1){
                List<Integer> l = new ArrayList<>();
                l.add(x);
                l.add(i);
                res.add(l);
                break;
            }
        }
        
        for(int i=y-1;i>=0;i--){
            if(chess[x][i] == 1){
                List<Integer> l = new ArrayList<>();
                l.add(x);
                l.add(i);
                res.add(l);
                break;
            }
        }
        
        for(int i=x+1,j=y+1;i < 8 && j < 8;i++,j++){
            if(chess[i][j] == 1){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j);
                res.add(l);
                break;
            }
        }
        
        for(int i=x+1,j=y-1;i < 8 && j >= 0;i++,j--){
            if(chess[i][j] == 1){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j);
                res.add(l);
                break;
            }
        }
        
        for(int i=x-1,j=y-1;i >= 0 && j >= 0;i--,j--){
            if(chess[i][j] == 1){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j);
                res.add(l);
                break;
            }
        }
        
        for(int i=x-1,j=y+1;i >= 0 && j < 8;i--,j++){
            if(chess[i][j] == 1){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j);
                res.add(l);
                break;
            }
        }
        
        return res;
    }
}