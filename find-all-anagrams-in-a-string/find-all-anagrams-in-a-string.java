class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        if(n<m)return Collections.emptyList();
        
        int hash[] = new int[26];
        for(int i=0;i<m;i++)hash[p.charAt(i) - 'a']++;
        
        List<Integer> l = new ArrayList<>();
        int i = 0,j = 0;
        int temp[] = new int[26];
        while(i < n && j < n){
            temp[s.charAt(j) - 'a']++;
            if(j - i + 1 < m){
                j++;
            }else{
                if(isAnagram(temp,hash)){
                    l.add(i);
                }
                
                temp[s.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }
        
        return l;
    }
    
    public boolean isAnagram(int[] temp,int[] hash){
        for(int i=0;i<26;i++){
            if(temp[i] != hash[i])return false;
        }
        
        return true;
    }
}