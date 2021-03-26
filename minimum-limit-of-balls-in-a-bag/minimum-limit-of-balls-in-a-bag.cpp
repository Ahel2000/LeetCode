class Solution {
public:
    int minimumSize(vector<int>& nums, int maxOperations) {
        int start=1,end=1e9;
        while(start<end){
            int mid=start+(end-start)/2;
            if(isValid(mid,nums,maxOperations)){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        
        return start;
    }
    
    bool isValid(int x,vector<int>& nums,int maxOperations){
        int total=0;
        for(auto num : nums){
            total+=(num-1)/x;
        }
        
        return total<=maxOperations;
    }
};