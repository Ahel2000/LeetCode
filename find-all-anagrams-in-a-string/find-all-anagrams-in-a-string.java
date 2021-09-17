class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(),m = p.length();
        List<Integer> res = new ArrayList<>();
        
        
        
        int cache[] = new int[26];
        for(int i=0;i<m;i++)cache[p.charAt(i) - 'a']++;
        
        int temp[] = new int[26];
        
        int i=0,j=0;
        while(i < n && j < n){
            char ch = s.charAt(j);
            temp[ch - 'a']++;
            
            if(j-i+1 < m)j++;
            else{
                if(isAnagram(cache,temp))res.add(i);
                
                temp[s.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }
        
        return res;
    }
    
    public boolean isAnagram(int[] cache,int temp[]){
        for(int i=0;i<26;i++){
            if(cache[i] != temp[i])return false;
        }
        
        return true;
    }
}