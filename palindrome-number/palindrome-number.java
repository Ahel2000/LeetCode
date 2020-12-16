class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        String num=Integer.toString(x);
        if(num.length()==1)return true;
        int i=0,j=num.length()-1,flag=0;
        while(i<j){
            if(num.charAt(i)!=num.charAt(j)){
                flag=1;
                break;
            }
            i++;
            j--;
        }
        if(flag==1)return false;
        return true;
    }
}
