class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int maxFreq = 0;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
            
            maxFreq = Math.max(maxFreq,map.get(nums[i]));
        }
        
        List<Integer> buckets[] = new ArrayList[maxFreq + 1];
        for(int i=0;i<=maxFreq;i++)buckets[i] = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            buckets[(int)e.getValue()].add((int)e.getKey());
        }
        
        List<Integer> res = new ArrayList<>();
        for(int i=maxFreq;i>n/3;i--){
            for(int x : buckets[i]){
                res.add(x);
            }
        }
        
        return res;
    }
}