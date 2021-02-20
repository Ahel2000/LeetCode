class Solution {
    public int minOperations(String s) {
        int num1=0,num2=0;
        
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(s.charAt(i)=='1')num1++;
                if(s.charAt(i)=='0')num2++;
            }else{
                if(s.charAt(i)=='0')num1++;
                if(s.charAt(i)=='1')num2++;
            }
        }
        
        return Math.min(num1,num2);
    }
}