class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //nums=perm(nums,visited,new ArrayList<>(),original);
        //nums=original;
        int i;
        for(i=n-1;i>=1;i--){
            if(nums[i-1] < nums[i])break;
        }
        
        if(i != 0){
            int j;
            for(j=n-1;j>=0;j--){
                if(nums[i-1] < nums[j])break;
            }
            swap(nums,i-1,j);
            reverse(nums,i);
        }else{
            Arrays.sort(nums);
        }
    }
    
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public int[] perm(int nums[],boolean visited[],List<Integer> list,int[] original){
        if(list.size()==nums.length){
            if(greater(list,nums,original)){
                for(int i=0;i<nums.length;i++){
                    original[i]=list.get(i);
                }
            }
            
        }else{
            for(int i=0;i<nums.length;i++){
                if(!visited[i]){
                    visited[i]=true;
                    list.add(nums[i]);
                    perm(nums,visited,list,original);
                    list.remove(list.size()-1);
                    visited[i]=false;
                }
            }
        }
        return original;
    }
    
    public boolean greater(List<Integer> list,int[] nums,int[] original){
        for(int i=0;i<nums.length;i++){
            if(nums[i]>list.get(i))return false;
        }
        
        for(int i=0;i<nums.length;i++){
            if(original[i]<list.get(i))return false;
        }
        
        return true;
    }
    
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}