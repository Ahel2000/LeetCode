class Solution {
    public String frequencySort(String s) {
        int hash[][] = new int[300][2];
        for(int i=0;i<300;i++)hash[i][0] = i;
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - '0'][1]++;
        }
        
        Arrays.sort(hash,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return Integer.compare(a[1],b[1]);
            }
        });
        
        String x = "";
        for(int i=299;i>=0;i--){
            for(int j=1;j<=hash[i][1];j++){
                x = x + (char)(hash[i][0] + '0');
            }
        }
        
        return x;
    }
}