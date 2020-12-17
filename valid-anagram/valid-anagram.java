class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()==0 && t.length()==0)return true;
        if(s.length() != t.length())return false;
        char []s1=s.toCharArray();
        char []s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String x1=new String(s1);
        String x2=new String(s2);
        if(x1.equals(x2))return true;
        return false;
    }
}
