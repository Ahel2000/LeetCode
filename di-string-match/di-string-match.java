class Solution {
    public int[] diStringMatch(String S) {
        int n=S.length(),start=0;
        int end=n;
        int[] A=new int[n+1];
        for(int i=0;i<n;i++){
            if(S.charAt(i)=='I'){
                A[i]=start;
                start++;
            }else{
                A[i]=end;
                end--;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)sum+=A[i];
        A[n]=n*(n+1)/2-sum;
        return A;
    }
}