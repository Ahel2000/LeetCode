class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int[][] table=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(table[i],0);
        }
        int start=0;
        int length=0;
        for(int i=0;i<n;i++){
            table[i][i]=1;
            start=i;
            length=1;
        }
        
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                start=i;
                length=2;
                table[i][i+1]=1;
            }
        }
        int c=2;
        for(int i=n-2;i>=0;i--){
            for(int j=i+2;j<n;j++){
                
                if(table[i+1][j-1]==1 && s.charAt(i)==s.charAt(j)){
                    table[i][j]=1;
                    if(j-i+1>length){
                        start=i;
                        length=j-i+1;
                    }
                }
            }
            
        }
        
        return s.substring(start,start+length);
        
    }
}
