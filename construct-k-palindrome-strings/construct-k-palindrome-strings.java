class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(n < k)return false;
        if(n == k)return true;
        
        int a[] = new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i) - 'a']++;
        }
        
        int odd = 0;
        for(int i=0;i<26;i++){
            if(a[i]%2 == 1)odd++;
        }
        
        if(odd > k)return false;
        return true;
    }
}