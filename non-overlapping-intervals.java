class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        if(intervals.length<=1)return 0;
        Arrays.sort(intervals, new Comparator<int[]>() { 
            
          @Override 
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
            if (entry1[1] > entry2[1]) 
                return 1; 
            else
                return -1; 
          } 
        }); 
        
        int m=1,i=0;
        for(int j=1;j<n;j++){
            if(intervals[j][0]>=intervals[i][1]){
                i=j;
                m++;
            }
        }
        
        return n-m;
    }
}
