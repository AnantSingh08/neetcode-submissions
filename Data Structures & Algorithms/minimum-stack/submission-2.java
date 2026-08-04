class MinStack {
    Stack< Pair<Integer, Integer>> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        int currentMin = st.isEmpty() ? val : Math.min(val ,st.peek().getValue());
        st.push(new Pair<>(val, currentMin));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().getKey();
    }
    
    public int getMin() {
        return st.peek().getValue();
    }
}
