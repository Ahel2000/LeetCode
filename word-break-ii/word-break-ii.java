class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res=new ArrayList<>();
        backtrack(s,wordDict,res,"");
        return res;
    }
    
    public void backtrack(String s,List<String> wordDict,List<String> res,String curr){
        if(wordDict.contains(s)){
            String x=(new String(curr+" "+s));
            res.add(x.substring(1));
        }
        
        for(int i=0;i<s.length();i++){
            String left=s.substring(0,i);
            String right=s.substring(i);
            
            if(wordDict.contains(left)){
                backtrack(right,wordDict,res,curr+" "+left);
            }
        }
    }
}