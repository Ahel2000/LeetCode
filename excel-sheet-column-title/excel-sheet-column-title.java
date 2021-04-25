class Solution {
    public String convertToTitle(int n) {
        HashMap<Integer,Character> map=new HashMap<>();
        map.put(1,'A');
        map.put(2,'B');
        map.put(3,'C');
        map.put(4,'D');
        map.put(5,'E');
        map.put(6,'F');
        map.put(7,'G');
        map.put(8,'H');
        map.put(9,'I');
        map.put(10,'J');
        map.put(11,'K');
        map.put(12,'L');
        map.put(13,'M');
        map.put(14,'N');
        map.put(15,'O');
        map.put(16,'P');
        map.put(17,'Q');
        map.put(18,'R');
        map.put(19,'S');
        map.put(20,'T');
        map.put(21,'U');
        map.put(22,'V');
        map.put(23,'W');
        map.put(24,'X');
        map.put(25,'Y');
        map.put(0,'Z');
        
        String s="";
        while(n!=0){
            int x=n%26;
            if(x==0){
                n--;
                s='Z'+s;
            }
            else s=map.get(x)+s;
            
            n=n/26;
            
        }
        return s;
    }
}