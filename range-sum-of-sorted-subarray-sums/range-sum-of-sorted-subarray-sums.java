class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> l=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                l.add(sum);
            }
        }
        
        Collections.sort(l);
        int sum=0;
        int N=1000000007;
        for(int i=left-1;i<=right-1;i++){
            sum=(sum+l.get(i))%N;
        }
        
        return sum;
    }
}