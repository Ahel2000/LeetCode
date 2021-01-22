public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0,i=0,j=0;
        int[] freq=new int[300];
        while(j<n){
            if(freq[s.charAt(j)]==0){
                freq[s.charAt(j)]++;
                ans=Math.max(ans,j-i+1);
                j++;
            }else{
                freq[s.charAt(i)]--;
                i++;
            }
        }
        return ans;
    }
}
