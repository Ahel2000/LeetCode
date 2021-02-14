class Solution {
    HashSet<String> map=new HashSet<>();
    public int numTilePossibilities(String tiles) {
        List<String> l=new ArrayList<>();
        helper(map,"",tiles);
        return map.size();
    }
    
    public void helper(HashSet<String> map,String curr,String left){
        if(curr.length()>0)map.add(new String(curr));
        
        for(int i=0;i<left.length();i++){
            
            helper(map,curr+left.charAt(i),left.substring(0,i)+left.substring(i+1,left.length()));
            
        }
    }
}