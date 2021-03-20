class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1)return -1;
        
        List<Integer> adj[]=new ArrayList[n];
        
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        
        for(int i=0;i<connections.length;i++){
            adj[connections[i][0]].add(connections[i][1]);
            adj[connections[i][1]].add(connections[i][0]);
        }
        
        int visited[]=new int[n];
        int num=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                num++;
                dfs(i,adj,visited);
            }
        }
        
        return num-1;
    }
    
    public void dfs(int v,List<Integer> adj[],int visited[]){
        visited[v]=1;
        
        for(int i=0;i<adj[v].size();i++){
            if(visited[adj[v].get(i)]==0)dfs(adj[v].get(i),adj,visited);
        }
    }
}