class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        List<String> possible = new ArrayList<>();
        for(int i=0;i<dictionary.size();i++){
            String x = dictionary.get(i);
            if(isPossible(s,x,s.length(),x.length())){
                possible.add(x);
            }
        }
        
        Collections.sort(possible);
        int len = Integer.MIN_VALUE;
        String res = "";
        for(int i=0;i<possible.size();i++){
            String x = possible.get(i);
            if(x.length() > res.length()){
                res = x;
                len = x.length();
            }
        }
        
        return res;
    }
    
    public boolean isPossible(String s,String x,int m,int n){
        if(n == 0)return true;
        if(m == 0)return false;
        
        if(s.charAt(m-1) == x.charAt(n-1)){
            return isPossible(s,x,m-1,n-1);
        }else{
            return isPossible(s,x,m-1,n);
        }
    }
}