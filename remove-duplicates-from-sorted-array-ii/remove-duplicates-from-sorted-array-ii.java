class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int length=1,count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>2)continue;
                else nums[length++]=nums[i];
            }else{
                nums[length++]=nums[i];
                count=1;
            }
        }
        
        return length;
    }
}