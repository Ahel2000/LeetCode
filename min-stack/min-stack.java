class MinStack {
​
    /** initialize your data structure here. */
    
    Stack<Integer> stack;
    Stack<Integer> trackStack;
    public MinStack() {
        stack=new Stack<>();
        trackStack=new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(trackStack.isEmpty())trackStack.push(x);
        else if(x<trackStack.peek())trackStack.push(x);
        else trackStack.push(trackStack.peek());
    }
    
    public void pop() {
        stack.pop();
        trackStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return trackStack.peek();
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
