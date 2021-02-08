class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        if(nums.length==0)return 1;
        Arrays.sort(nums);
        int n=nums.length;
        
        if(nums[nums.length-1]<=0)return 1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)map.put(nums[i],1);
        }
        
        
        int pos=0;
        int max=(nums[n-1]==2147483647)?nums[n-1]:nums[n-1]+1;
        for(int i=1;i<=max;i++){
            if(!map.containsKey(i))return i;
        }
        
        return pos;
    }
}