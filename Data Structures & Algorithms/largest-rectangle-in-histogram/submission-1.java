class Solution {
    public int largestRectangleArea(int[] heights) {
        // Using 2 Arrays
        int n = heights.length;
        int[] leftMost = new int[n];
        int[] rightMost = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++) {
            leftMost[i] = -1;
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(!st.isEmpty()) {
                leftMost[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1; i>=0; i--) {
            rightMost[i] = n;
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(!st.isEmpty()) {
                rightMost[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for(int i=0; i<n; i++) {
            maxArea = Math.max(maxArea, heights[i]*(rightMost[i]-leftMost[i]-1));
        }
        return maxArea;
    }
}
