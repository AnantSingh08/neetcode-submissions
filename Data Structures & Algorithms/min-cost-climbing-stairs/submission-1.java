class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 1) return cost[0];

        Integer[] dp = new Integer[cost.length];

        return Math.min(dfs(cost, 0, dp), dfs(cost, 1, dp));
    }

    int dfs(int[] cost,int idx, Integer[] dp) {
        if(idx >= cost.length) return 0;

        if(dp[idx] != null) return dp[idx];

        return dp[idx] = cost[idx]+Math.min(dfs(cost, idx+1, dp), dfs(cost, idx+2, dp));
    }
}
