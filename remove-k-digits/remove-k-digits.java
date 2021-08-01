class Solution {
    public String removeKdigits(String num, int k) {
        if(k > num.length())return "0";
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        
        int n = num.length();
        for(int i=0;i<n;i++){
            int x = num.charAt(i) - '0';
            while(!st.isEmpty() && k > 0 && x < st.peek()){
                st.pop();
                k--;
            }
            
            if(st.isEmpty() && x == 0)continue;
            st.push(x);
        }
        
        while(!st.isEmpty() && k > 0){
            st.pop();
            k--;
        }
        
        if(st.isEmpty())return "0";
        
        for(int i : st){
            sb.append(i + "");
        }
        
        return sb.toString();
    }
}