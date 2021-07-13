class Solution {
    public List<Integer> partitionLabels(String s) {
        int last[] = new int[26];
        int n = s.length();
        
        for(int i=0;i<n;i++){
            last[s.charAt(i) - 'a'] = i;
        }
        
        int l = -1, temp = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            l = Math.max(l,last[s.charAt(i) - 'a']);
            temp++;
            
            if(i == l){
                list.add(temp);
                temp = 0;
            }
        }
        
        return list;
    }
}