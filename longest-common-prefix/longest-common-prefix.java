class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min)min=strs[i].length();
        }
        
        int flag=0;
        String s="";
        
        for(int i=0;i<min;i++){
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(ch!=strs[j].charAt(i)){
                    flag=1;
                    break;
                }
            }
            if(flag==1)break;
            s+=ch;
        }
        
        return s;
    }
}