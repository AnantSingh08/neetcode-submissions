// Memoisation
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        return dfs(0,n,dp);
    }

    int dfs(int i, int n, int[] dp) {
        if (i >= n) return i == n ? 1 : 0;
        
        if(dp[i]!=-1) {
            return dp[i];
        }
        return dp[i] = dfs(i+1,n,dp)+dfs(i+2,n,dp);
    }
}
