class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0)return 0;
        Arrays.sort(points, new Comparator<int[]>() { 
            
          @Override 
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
            if (entry1[1] > entry2[1]) 
                return 1; 
            else
                return -1; 
          } 
        }); 
        
        int num=1,i=0;
        
        
        for(int j=1;j<points.length;j++){
            if(points[j][0]>points[i][1]){
                i=j;
                num++;
            }
        }
        return num;
    }
}
