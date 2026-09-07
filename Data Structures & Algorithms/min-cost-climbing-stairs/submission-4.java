// Space optimization
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 1) return cost[0];

        return dfs(cost);
    }

    int dfs(int[] cost) {

        int hop1 = 0;
        int hop2 = 0;
        
        for(int i=2; i<=cost.length; i++) {
            int min = Math.min(cost[i-1]+hop2, cost[i-2]+hop1);
            hop1 = hop2;
            hop2 = min;
        }

        return hop2;
    }
}
