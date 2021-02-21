class Solution {
    int[] num3;
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int x=num1.length;
        int y=num2.length;
        
        num3=new int[x+y];
        merge(num1,num2);
        
        if((x+y)%2==0){
            return (num3[(x+y)/2]+num3[(x+y-1)/2])*1.0/2;
        }else return num3[(x+y)/2]*1.0;
        
    }
    
    public void merge(int[] num1,int[] num2){
        int a=0,b=0,c=0;
        int l1=num1.length,l2=num2.length;
        while(a!=l1 && b!=l2){
            if(num1[a]<num2[b]){
                num3[c++]=num1[a++];
            }else{
                num3[c++]=num2[b++];
            }
        }
        
        while(a<l1){
            num3[c++]=num1[a++];
        }
        
        while(b<l2){
            num3[c++]=num2[b++];
        }
    }
}