class Solution {
    public String longestWord(String[] words) {
        int n = words.length;
        HashSet<String> set = new HashSet<>();
        for(String word : words)set.add(word);
        
        List<String> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(isPossible(set,words[i])){
                l.add(words[i]);
            }
        }
        
        Collections.sort(l,new Comparator<String>(){
            public int compare(String a,String b){
                if(a.length() != b.length())return Integer.compare(a.length(),b.length());
                else{
                    return a.compareTo(b) * (-1);
                }
            }
        });
        
        if(l.size() == 0)return "";
        return l.get(l.size() - 1);
    }
    
    public boolean isPossible(HashSet<String> set,String word){
        for(int i=1;i<=word.length();i++){
            if(!set.contains(word.substring(0,i)))return false;
        }
        
        return true;
    }
}