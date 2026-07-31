class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int res[] = new int[len-k+1];

        for(int i=0;i<=len-k;i++) {
            int max = Integer.MIN_VALUE;

            for(int j=i;j<i+k;j++) {
                max=Math.max(max,nums[j]);
            }
            res[i] = max;
        }

        return res;
    }
}
