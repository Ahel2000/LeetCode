class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor=image[sr][sc];
        int vis[][]=new int[image.length][image[0].length];
        dfs(image,sr,sc,newColor,oldColor,vis);
        return image;
    }
    
    public void dfs(int[][] image,int i,int j,int newColor,int old,int[][] vis){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length)return;
        if(vis[i][j]==1)return;
        if(image[i][j]!=old)return;
        
        image[i][j]=newColor;
        
        vis[i][j]=1;
        dfs(image,i-1,j,newColor,old,vis);
        dfs(image,i+1,j,newColor,old,vis);
        dfs(image,i,j+1,newColor,old,vis);
        dfs(image,i,j-1,newColor,old,vis);
        vis[i][j]=0;
    }
}