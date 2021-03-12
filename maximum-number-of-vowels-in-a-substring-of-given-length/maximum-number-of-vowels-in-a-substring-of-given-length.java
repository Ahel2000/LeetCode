class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int i=0,j=0;
        int n=s.length();
        int mx=0,num=0;
        while(j<n){
            if(vowels.contains(s.charAt(j)))num++;
            if(j-i+1<k){
                j++;
                
            }else if(j-i+1==k){
                mx=Math.max(mx,num);
                if(vowels.contains(s.charAt(i)))num--;
                i++;
                j++;
            }
        }
        
        return mx;
    }
}