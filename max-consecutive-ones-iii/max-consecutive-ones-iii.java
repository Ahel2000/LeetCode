class Solution {
    public int longestOnes(int[] A, int k) {
        int left=0,right=0;
        int max=0;
        while(right<A.length){
            if(A[right]==0)k--;
            
            while(k<0){
                if(A[left]==0)k++;
                left++;
            }
            
            right++;
            max=Math.max(max,right-left);
            
            
        }
        
        return max;
    }
}