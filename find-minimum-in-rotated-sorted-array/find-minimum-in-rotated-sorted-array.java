class Solution {
    public int findMin(int[] a) {
        int start=0,end=a.length-1;
        int n=a.length;
        if(a[start]<a[end])return a[start];
        while(start<=end){
            if(a[start]<=a[end])return a[start];
            int mid=start+(end-start)/2;
            if(a[mid]<=a[(mid+1)%n] && a[mid]<=a[(mid+n-1)%n])return a[mid];
            if(a[start]<=a[mid])start=mid+1;
            else if(a[mid]<=a[end])end=mid-1;
        }
        
        return -1;
    }
}