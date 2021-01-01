class Solution {
    HashMap<List<Integer>,Integer> map=new HashMap<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        perm(nums,visited,new ArrayList<>(),res);
        return res;
    }
    
    public void perm(int[] nums,boolean[] visited,List<Integer> list,List<List<Integer>> res){
        if(list.size()==nums.length){
            if(!map.containsKey(list)){
                map.put(list,1);
                res.add(new ArrayList(list));
            }
        }else{
            for(int i=0;i<nums.length;i++){
                if(!visited[i]){
                    visited[i]=true;
                    list.add(nums[i]);
                    perm(nums,visited,list,res);
                    visited[i]=false;
                    list.remove(list.size()-1);
                }
            }
        }
    }
}
