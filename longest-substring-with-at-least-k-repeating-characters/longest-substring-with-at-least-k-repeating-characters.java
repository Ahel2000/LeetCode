class Solution {
    public int longestSubstring(String s, int k) {
        int n=s.length();
        if(n==0 || k==0 || k>n)return 0;
        int a[]=new int[26];
        int length=0;
        for(int i=0;i<n;i++){
            Arrays.fill(a,0);
            for(int j=i;j<n;j++){
                a[s.charAt(j)-'a']++;
                if(isValid(a,k)){
                    length=Math.max(length,j-i+1);
                }
            }
        }
        return length;
    }
    
    public boolean isValid(int[] a,int k){
        for(int freq : a){
            if(freq!=0 && freq<k)return false;
        }
        return true;
    }
}