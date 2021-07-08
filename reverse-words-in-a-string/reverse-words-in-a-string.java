class Solution {
    public String reverseWords(String s) {
        List<String> l = new ArrayList<>();
        s = s + " ";
        int n = s.length();
        int i = 0,j = 0;
        
        while(i < n && j < n){
            if(s.charAt(j) == ' '){
                l.add(s.substring(i,j));
                while(j < n && s.charAt(j) == ' ')j++;
                i = j;
            }else{
                j++;
            }
        }
        
        String x = "";
        for(i=l.size()-1;i>=0;i--){
           x = x + l.get(i) + " "; 
        }
        
        return x.trim();
    }
}