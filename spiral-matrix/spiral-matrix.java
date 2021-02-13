class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int t=0,b=matrix.length-1,l=0,r=matrix[0].length-1;
        int dir=0;
        List<Integer> list=new ArrayList<>();
        while(t<=b && l<=r){
            if(dir==0){
                for(int i=l;i<=r;i++){
                    list.add(matrix[t][i]);
                }
                t++;
                dir=1;
            }else if(dir==1){
                for(int i=t;i<=b;i++){
                    list.add(matrix[i][r]);
                }
                r--;
                dir=2;
            }else if(dir==2){
                for(int i=r;i>=l;i--){
                    list.add(matrix[b][i]);
                }
                b--;
                dir=3;
            }else{
                for(int i=b;i>=t;i--){
                    list.add(matrix[i][l]);
                }
                l++;
                dir=0;
            }
        }
        return list;
        
    }
}