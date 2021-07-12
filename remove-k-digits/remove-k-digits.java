class Solution {
    public String removeKdigits(String num, int k) {
        if(k > num.length())return "0";
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<num.length();i++){
            int x = num.charAt(i) - '0';
            while(k > 0 && st.size() != 0 && st.peek() > x){
                st.pop();
                k--;
            }
            
            if(st.size() != 0 || x != 0)st.push(x);
        }
        
        while(k > 0 && st.size() != 0){
            st.pop();
            k--;
        }
        
        if(st.size() == 0)return "0";
        
        for(int i : st){
            sb.append(i + "");
        }
        
        return sb.toString();
    }
}