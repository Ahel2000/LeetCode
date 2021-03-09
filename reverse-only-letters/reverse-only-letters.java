class Solution {
    public String reverseOnlyLetters(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)))count++;
        }
        
        char[] a=new char[count];
        int d=0;
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)))a[d++]=s.charAt(i);
        }
        
        char b[]=new char[count];
        d=0;
        for(int i=count-1;i>=0;i--){
            b[d++]=a[i];
        }
        int c=0;
        String fin=new String("");
        
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)))fin+=b[c++];
            else fin+=s.charAt(i);
        }
        
        return fin;
    }
}