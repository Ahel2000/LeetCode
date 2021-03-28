class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1] ^ arr[i];
        }
        
        int res[]=new int[queries.length];
        int z=0;
        
        for(int i=0;i<queries.length;i++){
            int L=queries[i][0];
            int R=queries[i][1];
            if(L==0)res[z++]=prefix[R];
            else res[z++]=prefix[L-1] ^ prefix[R];
        }
        
        return res;
    }
}