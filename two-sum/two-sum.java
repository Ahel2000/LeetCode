class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []x=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                x[0]=map.get(nums[i]);
                x[1]=i;
                break;
            }else{
                map.put(target-nums[i],i);
            }
        }
        
        return x;    
        
    }
}
