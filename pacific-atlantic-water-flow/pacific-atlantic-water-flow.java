class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        
        List<List<Integer>> list=new ArrayList<>();
        if(matrix.length==0)return list;
        int[][] atlantic=new int[matrix.length][matrix[0].length];
        int[][] pacific=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            connected(i,0,matrix,pacific,0);
        }
        
        for(int i=0;i<matrix[0].length;i++){
            connected(0,i,matrix,pacific,0);
        }
        
        for(int i=0;i<matrix.length;i++){
            connected(i,matrix[0].length-1,matrix,atlantic,0);
        }
        
        for(int i=0;i<matrix[0].length;i++){
            connected(matrix.length-1,i,matrix,atlantic,0);
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(atlantic[i][j]==1 && pacific[i][j]==1){
                    List<Integer> l=new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    list.add(l);
                }
            }
        }
        
        return list;
    }
    
    public void connected(int i,int j,int[][] matrix,int[][] reach,int prev){
        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length)return;
        if(prev>matrix[i][j])return;
        if(reach[i][j]==1)return;
        reach[i][j]=1;
        
        connected(i-1,j,matrix,reach,matrix[i][j]);
        connected(i+1,j,matrix,reach,matrix[i][j]);
        connected(i,j-1,matrix,reach,matrix[i][j]);
        connected(i,j+1,matrix,reach,matrix[i][j]);
        
    }
}