class Solution {
    public String getPermutation(int n, int k) {
        List<String> result = new ArrayList<>();
        recursion(result,"", n, k,new boolean[n+1]);
        return result.get(k-1);
    }
    
    private void recursion(List<String> result, String temp, int max, int k, boolean[] seen){
        
        if(temp.length()==max){
            result.add(new String(temp));
        }else{
            for(int i =1;i<=max;i++){
                if(result.size()==k)break;
                if(seen[i]) continue;
                seen[i] =true;
                String newStr = temp+i;
                recursion(result,newStr,max,k,seen);
                seen[i] = false;
            }
        }
}
}