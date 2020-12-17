class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        if(n<m)return Collections.emptyList();
        List<Integer> l=new ArrayList<>();
        char ch[]=p.toCharArray();
        Arrays.sort(ch);
        String z=new String(ch);
        for(int i=0;i<=n-m;i++){
            String tmp=s.substring(i,i+m);
            char []q=tmp.toCharArray();
            Arrays.sort(q);
            String r=new String(q);
            if(r.equals(z))l.add(i);
        }
        return l;
    }
}
