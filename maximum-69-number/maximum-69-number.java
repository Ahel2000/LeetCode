class Solution {
    public int maximum69Number (int num) {
        String n=String.valueOf(num);
        char a[]=n.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='6'){
                a[i]='9';
                break;
            }
        }
        
        return Integer.valueOf(String.valueOf(a));
    }
}