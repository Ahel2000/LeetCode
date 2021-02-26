class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        if(n<4)return res;
        
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=nums[i]+nums[j];
                int target2=target-sum;
                int left=j+1,right=n-1;
                while(left<right){
                    int s=nums[left]+nums[right];
                    if(s<target2)left++;
                    else if(s>target2)right--;
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        int p1=nums[left],p2=nums[right];
                        while(left<right && nums[left]==p1)++left;
                        while(left<right && nums[right]==p2)--right;
                    }
                }
                
                while(j<n-1 && nums[j]==nums[j+1])++j;
            }
            while(i<n-1 && nums[i]==nums[i+1])++i;
        }
        
        return res;
    }
}