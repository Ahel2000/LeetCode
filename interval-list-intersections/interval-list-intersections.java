class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> temp = new ArrayList<>();
        
        int i = 0,j = 0;
        int m = A.length,n = B.length;
        List<int[]> ans = new ArrayList();
        
        int a[] = new int[2];
        
        while (i < m && j < n) {
      // Let's check if A[i] intersects B[j].
      // lo - the startpoint of the intersection
      // hi - the endpoint of the intersection
      int lo = Math.max(A[i][0], B[j][0]);
      int hi = Math.min(A[i][1], B[j][1]);
      if (lo <= hi)
        ans.add(new int[]{lo, hi});

      // Remove the interval with the smallest endpoint
      if (A[i][1] < B[j][1])
        i++;
      else
        j++;
    }

    return ans.toArray(new int[ans.size()][]);
    }
}