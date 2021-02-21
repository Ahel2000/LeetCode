class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int a[]=new int[k];
        int[][] l=new int[mat.length][2];
        
        for(int i=0;i<mat.length;i++){
            int num=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)num++;
            }
            l[i][0]=i;
            l[i][1]=num;
        }
        
        Arrays.sort(l,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return Integer.compare(a[1],b[1]);
            }
        });
        
        for(int i=0;i<k;i++){
            a[i]=l[i][0];
        }
        
        return a;
    }
}