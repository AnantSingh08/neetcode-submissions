// Memoisation
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        Integer[] dp = new Integer[nums.length];

        for(int i=0; i<nums.length; i++) {
            max = Math.max(max, dfs(nums,i,dp));
        }
        return max;
    }

    int dfs(int[] nums, int idx, Integer[] dp) {
        if(idx == 0) {
            return nums[0];
        }

        if(dp[idx]!=null) return dp[idx];

        return dp[idx] = Math.max(nums[idx],
        nums[idx]+dfs(nums, idx-1, dp)
        );
    }
}
