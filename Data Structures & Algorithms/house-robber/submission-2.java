// Memoisation
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        for(int i=0;i<=nums.length;i++) {
            dp[i] = -1;
        }
        return dfs(nums,0, dp);
    }

    int dfs(int[] nums, int idx, int[] dp) {
        int n = nums.length;
        if(idx>=n) return 0;

        if(dp[idx]!=-1) return dp[idx];

        return dp[idx] = Math.max(
            nums[idx] + dfs(nums,idx+2, dp),
            dfs(nums,idx+1, dp)
        );
    }
}
