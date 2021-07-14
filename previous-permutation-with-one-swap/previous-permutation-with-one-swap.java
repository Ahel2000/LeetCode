class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        int i = 0;
        for(i=n-2;i>=0;i--){
            if(arr[i] > arr[i+1])break;
        }
        
        if(i == -1)return arr;
        
        int j = n - 1;
        while(j >=0 && arr[j] > arr[i])j--;
        
        if(arr[j] == arr[i])swap(arr,i,i+1);
        else swap(arr,i,j);
        
        return arr;
    }
    
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}