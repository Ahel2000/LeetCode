class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        while(j>=0 && i<matrix.length){
            if(matrix[i][j]>target)j--;
            else if(matrix[i][j]<target)i++;
            else return true;
        }
        return false;
    }
}