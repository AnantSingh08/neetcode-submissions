class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        for(int i=0; i<=heights.length-2;i++) {
            for(int j=i+1;j<=heights.length-1;j++) {
                if ((j-i)*Math.min(heights[i],heights[j])>max) {
                    max = (j-i)*Math.min(heights[i],heights[j]);
                }
            }
        }
        return max;
    }
}
