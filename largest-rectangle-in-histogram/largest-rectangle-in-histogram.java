class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int n=heights.length;
        Stack<Integer> left=new Stack<>();
        int diff[][]=new int[n][2];
        
        diff[0][0]=0;
        
        left.push(0);
        for(int i=1;i<n;i++){
           while(!left.isEmpty() && heights[left.peek()]>=heights[i]){
               left.pop();
           } 
            if(!left.isEmpty())diff[i][0]=left.peek()+1;
            else diff[i][0]=0;
            left.push(i);
        }
        
        Stack<Integer> right=new Stack<>();
        diff[n-1][1]=n-1;
        right.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!right.isEmpty() && heights[right.peek()]>=heights[i]){
                right.pop();
            }
            if(!right.isEmpty())diff[i][1]=right.peek()-1;
            else diff[i][1]=n-1;
            right.push(i);
        }
        
        int area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,(diff[i][1]-diff[i][0]+1)*heights[i]);
        }
        
        return max;
    }
}