class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        int m=s1.length(),n=s2.length();
        if(m!=n)return false;
        
        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        int a=0,b=0;
        for(int i=0;i<m;i++){
            if(a1[i]>=a2[i])a++;
            if(a1[i]<=a2[i])b++;
        }
        
        return (a==m || b==m);
    }
}