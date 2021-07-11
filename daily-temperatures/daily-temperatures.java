class Solution {
    public int[] dailyTemperatures(int[] T) {
        int []temp = nextGreaterElement(T);
        int ans[] = new int[T.length];
        ans[0] = Math.max(temp[0] - 1,0);
        for(int i=1;i<T.length;i++){
            ans[i] = Math.max(temp[i]-i-1,0);
        }          
        return ans;
    }
    
    int[] nextGreaterElement(int[] nums) {
    int ans[] = new int[nums.length]; // array to store answer
    Stack<Integer> s = new Stack<>();
    for (int i = nums.length - 1; i >= 0; i--) { // put it into the stack back to front
        while (!s.isEmpty() && nums[s.peek()-1] <= nums[i]) { // determine by height
            s.pop(); // short one go away while blocked
        }
        ans[i] = s.isEmpty() ? 0 : s.peek(); // the first tall behind this element
        s.push(i+1); // get into the queue and wait for later height determination
    }
    return ans;
}
}