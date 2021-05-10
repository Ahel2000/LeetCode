class Solution {
    public int[] sortedSquares(int[] nums) {
        int pos=-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos=i;
                break;
            }
        }
        
        int i,j;
        if(pos>0){
            j=pos-1;
            i=pos;
        }else if(pos<0){
            i=nums.length;
            j=nums.length-1;
        }else{
            j=-1;
            i=0;
        }
        
        int[] squares=new int[nums.length];
        int index=0;
        
        while(i<nums.length && j>=0){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                squares[index++]=nums[j]*nums[j];
                j--;
            }else{
                squares[index++]=nums[i]*nums[i];
                i++;
            }
        }
        
        while(j>=0){
            squares[index++]=nums[j]*nums[j];
            j--;
        }
        
        while(i<nums.length){
            squares[index++]=nums[i]*nums[i];
            i++;
        }
        
        return squares;
    }
}