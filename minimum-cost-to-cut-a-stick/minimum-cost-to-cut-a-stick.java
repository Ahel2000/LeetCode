class Solution {

Map<String , Integer> map = new HashMap();
public int minCost(int n, int[] cuts) {     
     Arrays.sort(cuts); 
     return minCostToCut(0,n,cuts);
}


int minCostToCut(int start,int end,int cuts[]) {
    String key = start + ":" + end;
    
    if(map.containsKey(key)){
        return map.get(key);
    }
    
	//cost to make zero cuts 
    if(cuts.length == 0) {
        return 0;
    }
    
	//cost to make one cut 
    if(cuts.length == 1){
        return end - start;
    }
	
	//Trying every option where we can make the first cut
	//Recursive Formulae :  Minimum cost to make on left side  +  currentCost + Minimum cost to cut on right side 
    int min = Integer.MAX_VALUE;
    for(int i = 0 ; i < cuts.length;i++) { 
           String leftKey = start + ":" + cuts[i]; 
           int leftCut = map.containsKey(leftKey) ? map.get(leftKey) :  
                  minCostToCut(start,cuts[i] ,Arrays.copyOfRange(cuts ,0,i)) ;
           int cutCost =  end - start;
           String rightKey = cuts[i] + ":" + end; 
           int rightCut = map.containsKey(rightKey) ? map.get(rightKey) : 
           minCostToCut(cuts[i],end,Arrays.copyOfRange(cuts ,i+1,cuts.length));
          min = Math.min(min,leftCut + cutCost + rightCut);     
        } 
      map.put(key,min); 
     return  min ;
    }
}

