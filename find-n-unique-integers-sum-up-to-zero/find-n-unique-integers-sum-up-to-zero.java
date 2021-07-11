class Solution {
    public int[] sumZero(int n) {
       List<Integer> l = new ArrayList<>();
        if(n%2 == 1){
            l.add(0);
        }
        
        for(int i=1;i<=n/2;i++){
            l.add(i);
            l.add(i*(-1));
        }
        
        int a[] = new int[n];
        for(int i=0;i<n;i++)a[i] = l.get(i);
        return a;
    }
}