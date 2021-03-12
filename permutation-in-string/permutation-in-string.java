class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[]=new int[26];
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(map.containsKey(ch))map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        
        
        int i=0,j=0;
        int k=s1.length();
        if(k==0)return true;
        
        int n=s2.length();
        if(k>n)return false;
        
        while(j<n){
            char ch=s2.charAt(j);
            freq[ch-'a']++;
            if(j-i+1<k){
                j++;
                
            }else if(j-i+1==k){
                int flag=0;
                for(Map.Entry m : map.entrySet()){
                    char c=(char)m.getKey();
                    int t=(int)m.getValue();
                    
                    if(freq[c-'a']!=t){
                        flag=1;
                        break;
                    }
                }
                
                if(flag==0)return true;
                freq[s2.charAt(i)-'a']--;
                i++;
                j++;
            }
        }
        
        return false;
    }
}