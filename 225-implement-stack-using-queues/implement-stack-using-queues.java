class MyStack {
    Queue<Integer> queue = new LinkedList<>(); 
    public MyStack() {
       
    }
    
    public void push(int x) {
        int s = queue.size();
        queue.add(x);
        for(int i = 0; i < s; i++){
            queue.add(queue.remove());
        }
        
    }
    
    public int pop() {
        if(!queue.isEmpty()){
            return queue.poll();
        }
        return -1;
    }
    
    public int top() {
        if(!queue.isEmpty()){
            return queue.peek();
        }
        return -1;
    }
    
    public boolean empty() {
        if(!queue.isEmpty()){
            return false;
        }
        return true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */