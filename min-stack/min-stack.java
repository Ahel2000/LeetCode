class MinStack {
​
    /** initialize your data structure here. */
    int minStack;
    Stack<Integer> stack;
    public MinStack() {
        minStack=Integer.MAX_VALUE;
        stack=new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
        minStack=Math.min(x,minStack);
    }
    
    public void pop() {
        stack.pop();
        minStack=Integer.MAX_VALUE;
        Stack<Integer> temp=new Stack<>();
        while(!stack.isEmpty()){
            int m=stack.peek();
            minStack=Math.min(minStack,m);
            temp.push(stack.pop());
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack;
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
