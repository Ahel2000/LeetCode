class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        if(nums.length<3)return l;
        HashSet<List<Integer>> set=new HashSet<>();
    
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            int target=nums[i]*(-1);
            for(int j=i+1;j<nums.length;j++){
                if(map.containsKey(nums[j])){
                    List<Integer> list=new ArrayList<>();
                    Collections.addAll(list,nums[i],map.get(nums[j]),nums[j]);
                    Collections.sort(list);
                    if(!set.contains(list)){
                        set.add(list);
                        l.add(list);
                    }
                }else{
                        map.put(target-nums[j],nums[j]);
                    }
            }
        }
        return l;
    }
}