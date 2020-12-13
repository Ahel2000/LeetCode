class Solution {
    public boolean isValid(String s) {
        if(s.length()==0)return false;
        Stack<Character> str=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case '{':
                case '[':
                case '(':
                    str.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!str.isEmpty()){
                       char chr=str.pop();
                       if((ch==')' && chr!='(')||(ch==']' && chr!='[')||(ch=='}' && chr!='{'))
                           return false;
                    }else{
                        return false;
                    }
            }
        }
        if(!str.isEmpty())return false;
        return true;
    }
}
