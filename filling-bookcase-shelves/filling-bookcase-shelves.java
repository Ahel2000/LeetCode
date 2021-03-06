class Solution {
    int width;
    public int minHeightShelves(int[][] books, int shelf_width) {
        width=shelf_width;
        int memo[][]=new int[books.length+1][shelf_width+1];
        return minHeight(books,0,0,0,memo);
    }
    
    public int minHeight(int[][] books,int i,int shelf_width,int curr,int memo[][]){
        if(i==books.length)return curr;
        
        if(memo[i][shelf_width]>0)return memo[i][shelf_width];
        
        if(books[i][0]+shelf_width<=width){
            return memo[i][shelf_width]=Math.min(curr+minHeight(books,i+1,books[i][0],books[i][1],memo),
                            minHeight(books,i+1,shelf_width+books[i][0],Math.max(curr,books[i][1]),memo));
        }else{
            return memo[i][shelf_width]=curr+minHeight(books,i+1,books[i][0],books[i][1],memo);
        }
    }
}