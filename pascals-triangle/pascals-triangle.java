class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        if(numRows==0)return l;
        List<Integer> row0=new ArrayList<>();
        row0.add(1);
        l.add(row0);
        for(int i=1;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            List<Integer> prev=l.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prev.get(j)+prev.get(j-1));
            }
            row.add(1);
            l.add(row);
        }
        return l;
    }
}
