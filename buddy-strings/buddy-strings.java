class Solution {
    public boolean buddyStrings(String s, String goal) {
        int m = s.length();
        int n = goal.length();
        if(m != n)return false;
        
        
        if(s.equals(goal)){
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<n;i++){
                if(!set.contains(s.charAt(i)))set.add(s.charAt(i));
                else return true;   
            }
                   
            return false;       
        }
    
    
        
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i) != goal.charAt(i))set.add(i);
        }
        
        if(set.size() != 2)return false;
        
        int a[] = new int[2];
        int i = 0;
        for(int element : set){
            a[i++] = element;
        }
        
        return (s.charAt(a[0]) == goal.charAt(a[1]) && s.charAt(a[1]) == goal.charAt(a[0]));
    }
}