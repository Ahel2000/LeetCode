class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        perm(nums,visited,new ArrayList<>(),res);
        return res;
    }
    
    public void perm(int[] nums,boolean visited[],List<Integer> list,List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList(list));
            return;
    }else{
            for(int i=0;i<nums.length;i++){
                if(visited[i]!=true){
                list.add(nums[i]);
                visited[i]=true;
                perm(nums,visited,list,res);
                list.remove(list.size()-1);
                visited[i]=false;
                }
            }
        }
    }
}
