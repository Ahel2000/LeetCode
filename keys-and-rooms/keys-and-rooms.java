class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[]=new boolean[rooms.size()];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        visited[0]=true;
        while(!stack.isEmpty()){
            int z=stack.pop();
            for(int m : rooms.get(z)){
                if(!visited[m]){
                    stack.push(m);
                    visited[m]=true;
                }
            }
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false)return false;
        }
        return true;
    }
    
    
}