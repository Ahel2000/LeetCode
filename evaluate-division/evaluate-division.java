class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,Integer> map = new HashMap<>();
        int num = 0;
        for(int i=0;i<equations.size();i++){
            if(!map.containsKey(equations.get(i).get(0))){
                map.put(equations.get(i).get(0),num++);
            }
            
            if(!map.containsKey(equations.get(i).get(1))){
                map.put(equations.get(i).get(1),num++);
            }
        }
        
        int n = map.size();
        double graph[][] = new double[n][n];
        for(int i=0;i<equations.size();i++){
            graph[map.get(equations.get(i).get(0))][map.get(equations.get(i).get(1))] =                                                                                     values[i];
            graph[map.get(equations.get(i).get(1))][map.get(equations.get(i).get(0))] =                                                                              1 * 1.0/values[i];
        }
        
        List<Double> res = new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            if(map.containsKey(queries.get(i).get(0)) && 
               map.containsKey(queries.get(i).get(1))){
                double d = dijkstra(graph,map.get(queries.get(i).get(0)),
                             map.get(queries.get(i).get(1)),n);
                if(d == Double.MAX_VALUE)res.add(-1.00000);
                else res.add(d);
            }else{
                res.add(-1.00000);
            }
        }
        
        double[] result = new double[res.size()];
        for(int i=0;i<res.size();i++)result[i] = res.get(i);
        return result;
    }
    
    public double dijkstra(double graph[][], int src,int dest,int V){
        double dist[] = new double[V]; // The output array. dist[i] will hold
        // the shortest distance from src to i
 
        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];
 
        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Double.MAX_VALUE;
            sptSet[i] = false;
        }
 
        // Distance of source vertex from itself is always 0
        dist[src] = 1;
 
        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet,V);
 
            // Mark the picked vertex as processed
            sptSet[u] = true;
 
            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)
 
                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Double.MAX_VALUE)
                    dist[v] = dist[u] * graph[u][v];
        }
        
        return dist[dest];
    }
    
    public int minDistance(double dist[], Boolean sptSet[],int V)
    {
        // Initialize min value
        double min = Double.MAX_VALUE;
        int min_index = -1;
 
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
 
        return min_index;
    }
 

}