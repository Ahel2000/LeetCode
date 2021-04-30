class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            if(sum==k)count++;
            
            if(map.containsKey(sum-k)){
                List<Integer> l=map.get(sum-k);
                count+=l.size();
            }
            
            if(!map.containsKey(sum)){
                List<Integer> l=new ArrayList<>();
                l.add(sum);
                map.put(sum,l);
            }else{
                List<Integer> l=map.get(sum);
                l.add(sum);
                map.put(sum,l);
            }
        }
        
        return count;
    }
}