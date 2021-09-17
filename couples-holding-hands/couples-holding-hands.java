class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        for(int i=0;i<n;i++){
            if(row[i] % 2 == 1)row[i]--;
        }
        
        int swaps = 0;
        for(int i=0;i<n;i+=2){
            if(row[i] == row[i+1])continue;
            for(int j=i+1;j<n;j++){
                if(row[i] == row[j]){
                    int temp = row[i+1];
                    row[i+1] = row[j];
                    row[j] = temp;
                    swaps++;
                    break;
                }
            }
        }
        
        return swaps;
    }
}