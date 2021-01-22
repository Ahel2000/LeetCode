class Solution {
    HashMap<List<Integer>,Integer> map=new HashMap<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,new ArrayList<>(),res);
        return res;
    }
    
    public void helper(int index,int[] nums,List<Integer> current,List<List<Integer>> res){
        List l=new ArrayList<>(current);
        Collections.sort(l);
        if(!map.containsKey(l)){
            res.add(l);
            map.put(l,1);
        }
        
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            helper(i+1,nums,current,res);
            current.remove(current.size()-1);
        }
    }
}
