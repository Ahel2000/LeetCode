class Solution {
    int maxSize = Integer.MIN_VALUE;
    HashSet<String> set;
    public List<String> removeInvalidParentheses(String s) {
        set = new HashSet<>();
        List<String> all = new ArrayList<>();
        backtrack(s,0,"",all);
        
        List<String> res = new ArrayList<>();
        for(String x : all){
            if(x.length() == maxSize)res.add(x);
        }
        
        return res;
    }
    
    public void backtrack(String s,int rem,String curr,List<String> all){
        if(s.length() == 0){
            if(rem == 0 && !set.contains(curr)){
                all.add(curr);
                set.add(curr);
                maxSize = Math.max(maxSize,curr.length());
            }
            
            return;
        }
        
        char ch = s.charAt(0);
        if(ch == '('){
            backtrack(s.substring(1),rem + 1,curr + '(',all);
            backtrack(s.substring(1),rem,curr,all);
        }else if(ch == ')'){
            if(rem > 0)backtrack(s.substring(1),rem - 1,curr + ')',all);
            backtrack(s.substring(1),rem,curr,all);
        }else{
            backtrack(s.substring(1),rem,curr + ch,all);
        }
    }
}