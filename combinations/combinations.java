class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        helper(n,k,1,res,new ArrayList<>());
        return res;
    }
    
    public void helper(int n,int k,int start,List<List<Integer>> res,List<Integer> curr){
        if(k==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        if(start>n)return;
        
        curr.add(start);
        helper(n,k-1,start+1,res,curr);
        curr.remove(curr.size()-1);
        helper(n,k,start+1,res,curr);
        
    }
}
