class Solution {
    public int count=0;
    public int totalNQueens(int n) {
        helper(n,0,new ArrayList<>());
        
        return count;
    }
    
    public void helper(int n,int row,List<Integer> current){
        if(row==n){
            count++;
            return;
        }
        
        for(int i=0;i<n;i++){
            current.add(i);
            if(isValid(current)){
                helper(n,row+1,current);
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