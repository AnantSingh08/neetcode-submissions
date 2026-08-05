class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        Stack<int[]> st = new Stack<>(); // value, index
        for(int i=0; i<n; i++) {

            while(!st.isEmpty() && st.peek()[0] < temperatures[i])  
            {
                int[] pair = st.pop();
                res[pair[1]] = i - pair[1];
            }

            st.push(new int[]{temperatures[i], i});
        }
        return res;
    }
}
