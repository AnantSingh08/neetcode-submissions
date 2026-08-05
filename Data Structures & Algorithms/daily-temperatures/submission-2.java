class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]) {
                int idx = st.pop();
                res[idx] = i-idx;
            }

            st.push(i);
        }
        return res;
    }
}
