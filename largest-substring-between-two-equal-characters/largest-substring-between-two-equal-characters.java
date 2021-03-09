class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> first=new HashMap<>();
        HashMap<Character,Integer> last=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(first.containsKey(s.charAt(i))){
                last.put(s.charAt(i),i);
            }else{
                first.put(s.charAt(i),i);
                last.put(s.charAt(i),i);
            }
        }
        
        int max=Integer.MIN_VALUE;
        for(Map.Entry map : first.entrySet()){
            Character key=(char)map.getKey();
            max=Math.max(max,last.get(key)-first.get(key));
        }
        
        return max-1;
    }
}