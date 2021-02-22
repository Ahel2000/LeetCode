class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<List<String>> resf=new ArrayList<>();
        helper(n,0,res,new ArrayList<>());
        String s="";
        for(int i=0;i<n;i++)s+=".";
        for(int i=0;i<res.size();i++){
            List<Integer> ll=res.get(i);
            List<String> l=new ArrayList<>();
            
            for(int j=0;j<n;j++){
                String z="";
                for(int k=0;k<n;k++){
                    if(ll.get(j)==k)z+="Q";
                    else z+=".";
                }
                l.add(j,z);
            }
            
            resf.add(l);
        }
        return resf;
    }
    
    public void helper(int n,int row,List<List<Integer>> res,List<Integer> current){
        if(row==n){
            res.add(new ArrayList<>(current));
            return;
        }
        
        for(int i=0;i<n;i++){
            current.add(i);
            if(isValid(current)){
                helper(n,row+1,res,current);
            }
            current.remove(current.size()-1);
        }
    }
    
    public boolean isValid(List<Integer> current){
        int rowId=current.size()-1;
        for(int i=0;i<rowId;i++){
            int diff=Math.abs(current.get(i)-current.get(rowId));
            if(diff==0 || diff==rowId-i)return false;
        }
        return true;
    }
}