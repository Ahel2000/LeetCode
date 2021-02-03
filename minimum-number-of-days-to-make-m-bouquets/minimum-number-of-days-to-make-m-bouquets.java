class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int res=-1;
        
        List<Integer> l=new ArrayList<>();
        for(int i:bloomDay){
            l.add(i);
        }
        int start=Collections.min(l);
        int end=Collections.max(l);
        
        while(start<=end){
            int mid=(start+end)/2;
            if(isValid(bloomDay,m,k,mid)){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(res==-1)return res;
        return res;
    }
    
    public boolean isValid(int[] arr,int m,int k,int n){
        int num=0,s=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=n){
                num++;
            }else{
                num=0;
            }
            if(num==k){
                s++;
                num=0;
            }
            if(s==m)return true;
        }
        return false;
    }
}