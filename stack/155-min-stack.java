class MinStack {
    ArrayDeque<Integer> stk = new ArrayDeque<>();
    ArrayDeque<Integer> minStk = new ArrayDeque<>();
    public MinStack() {
    }
    
    public void push(int val) {
        stk.push(val);
        
        if(this.minStk.isEmpty()){
            minStk.push(val);
        }
        else{
            if(val <= minStk.peek()){
                minStk.push(val);
            }
        }
    }
    
    public void pop() {
        int removed = stk.pop();
               
        if(removed == minStk.peek())
            minStk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */