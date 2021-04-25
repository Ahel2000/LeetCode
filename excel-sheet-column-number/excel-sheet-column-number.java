class Solution {
    public int titleToNumber(String s) {
        int col=0;
        int alpha[]=new int[26];
        for(int i=0;i<26;i++)alpha[i]=i+1;
        
        int x=1;
        for(int i=s.length()-1;i>=0;i--){
            col+=x*alpha[s.charAt(i)-'A'];
            x=x*26;
        }
        
        return col;
    }
}