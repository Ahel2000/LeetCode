class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res=new ArrayList<>();
        
        helper(arr,k,n,new ArrayList<Integer>(),res,9);
        return res;
    }
    
    public void helper(int[] arr,int k,int n,List<Integer> list,List<List<Integer>> res,int start){
        
        
        if(k==0){
            if(n==0)res.add(new ArrayList(list));
            return;
        }
        
        if(start==0)return;
        
        if(arr[start-1]<=n){
            list.add(arr[start-1]);
            helper(arr,k-1,n-arr[start-1],list,res,start-1);
            list.remove(list.size()-1);
            helper(arr,k,n,list,res,start-1);
        }else{
            helper(arr,k,n,list,res,start-1);
        }
    }
}