class Solution {
    public int minMutation(String start, String end, String[] bank) {
        int n = start.length();
        HashSet<String> set = new HashSet<>();
        for(String s : bank)set.add(s);
        
        if(!set.contains(end))return -1;
        
        int ans = 1;
        Queue<String> q = new LinkedList<>();
        q.add(start);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                String top = q.poll();
                for(int j=0;j<top.length();j++){
                    char obj = top.charAt(j);
                    for(char ch = 'A';ch <= 'Z';ch++){
                        char[] temp = top.toCharArray();
                        temp[j] = ch;
                        top = String.valueOf(temp);
                        
                        
                        if(top.equals(end))return ans;
                        if(!set.contains(top))continue;
                        
                        set.remove(top);
                        q.add(top);
                    }
                    
                    char[] temp = top.toCharArray();
                    temp[j] = obj;
                    top = String.valueOf(temp);
                }
            }
            
            ans++;
        }
        
        return -1;
    }
}