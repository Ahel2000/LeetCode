class Solution {
    private int[] id;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        id = new int[n];
        for(int i=0;i<n;i++){
            id[i]=i;
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j] == 1)union(i,j);
            }
        }
        
        int provinces = 0;
        for(int i=0;i<n;i++){
            if(id[i] == i)provinces++;
        }
        
        return provinces;
    }
    
    public int root(int i){
        while(i!=id[i])i=id[i];
        return i;
    }
    
    public boolean connected(int p,int q){
        return (root(p)==root(q));
    }
    
    public void union(int p,int q){
        int i=root(p);
        int j=root(q);
        id[i]=j;
    }
}