class MyStack {
    int []theStack;
    int size;
    int top;
    /** Initialize your data structure here. */
    public MyStack() {
        theStack=new int[100];
        size=100;
        top=-1;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        theStack[++top]=x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return theStack[top--];
    }
    
    /** Get the top element. */
    public int top() {
        return theStack[top];
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return top==-1;
    }
}
​
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
