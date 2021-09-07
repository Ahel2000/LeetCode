class Solution {
    int[] result = new int[2];
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int parent[] = new int[n+1];
        make_tree(parent);
        
        for(int i=0;i<n;i++){
            union_sets(edges[i],result,parent);
        }
        
        return result;
    }
    
    public void make_tree(int[] id){
        for(int i=1;i<id.length;i++)id[i] = i;
    }
    
    public int find_set(int v,int[] parent) {
        if (v == parent[v])
            return v;
        return find_set(parent[v],parent);
    }

    public void union_sets(int edges[],int[] result,int[] parent) {
        int a = find_set(edges[0],parent);
        int b = find_set(edges[1],parent);
        if (a != b)
            parent[b] = a;
        else{
            result[0] = edges[0];
            result[1] = edges[1];
        }
    }
}