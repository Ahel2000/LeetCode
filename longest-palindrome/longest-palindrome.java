class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        
        int length=0;
        for(Map.Entry m : map.entrySet()){
            if((int)m.getValue()%2==0)length+=(int)m.getValue();
            else length+=(int)m.getValue()-1;
        }
        
        
        
        return (length<s.length())?length+1:length;
    }
}