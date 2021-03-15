class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] courses=new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) { 
            courses[i] = new ArrayList<Integer>(); 
        }
        for(int i=0;i<prerequisites.length;i++){
            courses[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        
        return !detectCycle(numCourses,courses);
    }
    
    boolean detectCycle(int n,List<Integer>[] courses){
        int x[]=new int[n];
        for(int i=0;i<n;i++){
           if(x[i]==0){
               if(detectCycleUtil(i,courses,x))return true;
           } 
        }
        
        return false;
    }
    
    boolean detectCycleUtil(int v,List<Integer>[] courses,int[] x){
        if(x[v]==1)return true;
        if(x[v]==2)return false;
        
        x[v]=1;
        
        for(int i=0;i<courses[v].size();i++){
                if(detectCycleUtil(courses[v].get(i),courses,x)){
                    return true;
                }
        }
        
        x[v]=2;
        return false;
    }
}