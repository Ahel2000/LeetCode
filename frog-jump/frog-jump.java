class Solution {
    HashMap<String,Boolean> map=new HashMap<>();
    public boolean canCross(int[] stones) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<stones.length;i++){
            set.add(stones[i]);
        }
        if(stones[1]!=1)return false;  
        
        
        return canCross(stones[stones.length-1],stones[1],1,set);    
            
    }
    
    public boolean canCross(int destination,int current,int k,HashSet<Integer> set){
        if(k==0)return false;
        if(current>destination)return false;
        if(current==destination)return true;
        String s=current+" "+k;
        if(map.containsKey(s))return map.get(s);
        if(set.contains(current)){
            boolean can= canCross(destination,current+k,k,set)||canCross(destination,current+k+1,k+1,set)||canCross(destination,current+k-1,k-1,set);
            map.put(current+" "+k,can);
            return can;
        }
        map.put(current+" "+k,false);
        return false;
    }
}