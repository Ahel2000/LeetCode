class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        helper(0,s,new ArrayList<String>(),result);
        return result;
    }
    
    public void helper(int start,String s,List<String> list,List<List<String>> result){
        if(start>=s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=start;i<s.length();i++){
            String s1=s.substring(start,i+1);
            if(isPalindrome(s,start,i)){
                list.add(s1);
                helper(i+1,s,list,result);
                list.remove(list.size()-1);
            }
        }
    }
    
    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--))return false;
        }
        return true;
    }
}
