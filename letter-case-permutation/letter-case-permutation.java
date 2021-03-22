class Solution {
    String ch="";
    public List<String> letterCasePermutation(String S) {
        boolean visited[]=new boolean[S.length()];
        List<String> res=new ArrayList<>();
        ch=S;
        
        backtrack("",S,res,0);
        return res;
    }
    
    public void backtrack(String curr,String s,List<String> res,int start){
        if(curr.length()==s.length()){
            res.add(curr);
            return;
        }else{
            
                if(Character.isAlphabetic(s.charAt(start))){
                backtrack(curr+Character.toUpperCase(s.charAt(start)),s,res,start+1);
                backtrack(curr+Character.toLowerCase(s.charAt(start)),s,res,start+1); 
                }else{
                    backtrack(curr+s.charAt(start),s,res,start+1);
                }
            
        }
    }
    
    public String create(String curr){
        int i=0,j=0;
        String create="";
        while(j<curr.length() && i<ch.length()){
            if(Character.isAlphabetic(ch.charAt(i))){
                create+=curr.charAt(j++);
                i++;
            }else{
                create+=ch.charAt(i++);
            }
        }
        
        while(j<curr.length()){
            create+=curr.charAt(j++);
        }
        
        while(i<ch.length()){
            create+=ch.charAt(i++);
        }
        
        return create;
    }
}