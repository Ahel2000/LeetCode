class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> l=new ArrayList<>();
        int n=intervals.length;
        if(n==0){
            int [][]a=new int[1][2];
            a[0][0]=newInterval[0];
            a[0][1]=newInterval[1];
            return a;
        }
        int[][] finterval=new int[n+1][2];
        int i;
        for(i=0;i<n;i++){
           if(intervals[i][0]<=newInterval[0]){
               finterval[i]=intervals[i];
           }else{
               finterval[i]=newInterval;
               break;
           } 
        }
        
        
        for(int j=i+1;j<=n;j++){
            finterval[j]=intervals[i++];
        }
        
        if(finterval[n][0]==0)finterval[n]=newInterval;
        for(int j=0;j<=n;j++){
            int k=j+1;
            int max=finterval[j][1];
            while(k<=n && (finterval[k][0]<=max || finterval[k-1][1]>=finterval[k][0])){
                max=Math.max(finterval[k][1],max);
                k++;
            }
            
            l.add(new int[]{finterval[j][0],max});
            j=k-1;
        }
        
        return l.toArray(new int[l.size()][]);
    }
}