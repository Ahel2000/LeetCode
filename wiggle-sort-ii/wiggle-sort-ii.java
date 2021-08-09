class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        for(int i=0;i<n;i++)temp[i] = nums[i];
        
        Arrays.sort(temp);
        int i = 1,j = n-1;
        while(i < n && j >= n/2){
            nums[i] = temp[j];
            j--;
            i+=2;
        }
        
        i = 0;
        while(i < n && j >= 0){
            nums[i] = temp[j];
            j--;
            i+=2;
        }
    }
}