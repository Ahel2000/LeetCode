class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != '#')st1.push(ch);
            else{
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
        }
        
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch != '#')st2.push(ch);
            else{
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
        }
        
        while(!st1.isEmpty() && !st2.isEmpty()){
            if(st1.pop() != st2.pop())return false;
        }
        
        if(!st1.isEmpty() || !st2.isEmpty())return false;
        return true;
    }
}