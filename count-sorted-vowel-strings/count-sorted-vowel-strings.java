class Solution {
    char[] c={'a','e','i','o','u'};
    public int countVowelStrings(int n) {
        List<List<Character>> l=new ArrayList<>();
        helper(l,new ArrayList<>(),0,n);
        return l.size();
    }
    
    public void helper(List<List<Character>> l,List<Character> curr,int start,int n){
        if(curr.size()==n){
            l.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=start;i<5;i++){
            curr.add(c[i]);
            helper(l,curr,i,n);
            curr.remove(curr.size()-1);
        }
    }
}