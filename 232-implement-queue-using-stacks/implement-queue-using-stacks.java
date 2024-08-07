class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int k = st2.pop();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return k;
    }
    
    public int peek() {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int k = st2.peek();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return k;
    }
    
    public boolean empty() {
        if(st1.isEmpty() && st2.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */