class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> l=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] a=s.toCharArray();
            Arrays.sort(a);
            s=new String(a);
            if(map.containsKey(s)){
                List<String> li=map.get(s);
                li.add(strs[i]);
                map.put(s,li);
            }else{
                List<String> li=new ArrayList<>();
                li.add(strs[i]);
                map.put(s,li);
            }
        }
        
        for (Map.Entry<String,List<String>> entry : map.entrySet()){
            l.add(entry.getValue());
        }
        
        return l;
            
    }
}