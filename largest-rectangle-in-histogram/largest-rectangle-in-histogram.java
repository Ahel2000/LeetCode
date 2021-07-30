class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int n=heights.length;
        
        List<Integer> right = new ArrayList<>();
        Stack<Integer> s1 = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty() && heights[i] <= heights[s1.peek()]){
                s1.pop();
            }
            
            if(s1.isEmpty())right.add(n);
            else right.add(s1.peek());
            s1.push(i);
        }
        
        Collections.reverse(right);
        
        Stack<Integer> s2 = new Stack<>();
        List<Integer> left = new ArrayList<>();
        for(int i=0;i<n;i++){
           while(!s2.isEmpty() && heights[i] <= heights[s2.peek()]){
                s2.pop();
            } 
            
            if(s2.isEmpty())left.add(-1);
            else left.add(s2.peek());
            s2.push(i);
        }
        
        int area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max, (right.get(i) - left.get(i) - 1)*heights[i]);
        }
        
        return max;
    }
}