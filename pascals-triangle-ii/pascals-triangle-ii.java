class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> l=new ArrayList<>();
        if(rowIndex<0)return Collections.emptyList();
        List<Integer> row0=new ArrayList<>();
        row0.add(1);
        l.add(row0);
        if(rowIndex==0)return row0;
        for(int i=1;i<=rowIndex;i++){
            List<Integer> row=new ArrayList<>();
            List<Integer> prev=l.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prev.get(j)+prev.get(j-1));
            }
            row.add(1);
            l.add(row);
        }
        return l.get(rowIndex);
    }
}
