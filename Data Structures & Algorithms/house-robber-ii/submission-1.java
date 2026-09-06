class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];

        Integer[] dp1 = new Integer[n];
        Integer[] dp2 = new Integer[n];

        return Math.max(
            dfs(nums,0,n-2,dp1),
            dfs(nums,1,n-1,dp2)
        );
    }

    int dfs(int[] nums, int idx, int end, Integer[]dp) {
        if (idx>end)
            return 0;

        if(dp[idx]!=null) return dp[idx];
        return dp[idx] = Math.max(nums[idx] + dfs(nums, idx + 2, end, dp), dfs(nums, idx + 1, end, dp));
    }
}
