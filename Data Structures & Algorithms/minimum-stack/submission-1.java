class MinStack {
    private Stack<Integer> st;

    // This will keep the min at each level
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty() || val<=min.peek()) {
            min.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        int stTop = st.peek();
        int minTop = min.peek();
        if(stTop == minTop) {
            min.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
