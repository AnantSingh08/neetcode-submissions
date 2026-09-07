// Space optimization
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];

        return Math.max(
            dfs(nums,0,n-2),
            dfs(nums,1,n-1)
        );
    }

    int dfs(int[] nums, int start, int end) {
        int numberOfHouses = end-start+1;

        int[] dp = new int[numberOfHouses + 1];
        int first = 0;
        int second = nums[start];

        for(int i=2;i<=numberOfHouses;i++) {
            int max = Math.max(
                nums[start+i-1] + first,
                second
            );
            first = second;
            second = max;
        }
        return second;
    }
}

