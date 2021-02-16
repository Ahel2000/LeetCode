class Solution {
    public int splitArray(int[] arr, int m) {
        if(arr.length<m)return 0;
        int start=0,end=0,n=arr.length;
        for(int i=0;i<n;i++){
            end+=arr[i];
            if(arr[i]>start)start=arr[i];
        }
        
        int res=-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isValid(arr,m,mid)){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        
        return res;
    }
    
    public boolean isValid(int[] arr,int m,int mid){
        int s=1,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                sum=arr[i];
                s++;
            }
            if(s>m)return false;
            
        }
        
        return true;
    }
}