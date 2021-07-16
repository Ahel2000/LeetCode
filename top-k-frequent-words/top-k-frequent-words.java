class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Arrays.sort(words);
        TreeMap<String,Integer> map = new TreeMap<>();
        int maxFreq = 0;
        for(String x : words){
            if(map.containsKey(x))map.put(x,map.get(x) + 1);
            else map.put(x,1);
            
            maxFreq = Math.max(maxFreq,map.get(x));
        }
        
        List<String> buckets[] = new ArrayList[maxFreq + 1];
  
        // initializing
        for (int i = 0; i <= maxFreq; i++) {
            buckets[i] = new ArrayList<String>();
        }
  
        for(Map.Entry<String,Integer> e : map.entrySet()){
            buckets[(int)e.getValue()].add(String.valueOf(e.getKey()));
        }
        
        List<String> res = new ArrayList<>();
        for(int i=maxFreq;i>=0 && k>0;i--){
            for(int j=0;j<buckets[i].size() && k>0;j++){
                res.add(buckets[i].get(j));
                k--;
            }
        }
        
        return res;
    }
}