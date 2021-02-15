class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],2);
            }else{
                map.put(nums[i],1);
            }
        }
        
        for(Map.Entry mapEl : map.entrySet()){
            if((int)mapEl.getValue()==1)return (int)mapEl.getKey();
        }
        
        return 0;
    }
}