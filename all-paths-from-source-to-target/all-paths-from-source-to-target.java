class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        boolean visited[]=new boolean[graph.length];
        helper(0,graph,visited,new ArrayList<>(),res);
        return res;
    }
    
    public void helper(int vertex,int[][] graph,boolean[] visited,List<Integer> curr,List<List<Integer>> res){
        if(vertex==graph.length-1){
            curr.add(vertex);
            res.add(new ArrayList<>(curr));
            curr.remove(curr.size()-1);
            return;
        }
        
        if(vertex>=graph.length)return;
        
        for(int i=0;i<graph[vertex].length;i++){
            if(visited[vertex]==false){
                visited[vertex]=true;
                curr.add(vertex);
                helper(graph[vertex][i],graph,visited,curr,res);
                curr.remove(curr.size()-1);
                visited[vertex]=false;
            }
        }
    }
}
