class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        List<int[]> l=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int j=i+1;
            int max=intervals[i][1];
            while(j<intervals.length && (intervals[j-1][1]>=intervals[j][0] || intervals[j][0]<=max)){
                max=Math.max(intervals[j][1],max);
                j++;
            }
            
            int []a=new int[2];
            a[0]=intervals[i][0];
            a[1]=max;
            l.add(a);
            i=j-1;
        }
        
        int res[][]=new int[l.size()][2];
        for(int i=0;i<l.size();i++){
            res[i][0]=l.get(i)[0];
            res[i][1]=l.get(i)[1];
        }
        
        return res;
    }
}
