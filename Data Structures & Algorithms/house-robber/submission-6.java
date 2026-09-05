// Space optimization
class Solution {
    public int rob(int[] nums) {
        if(nums.length<=0) return 0;
        if(nums.length==1) return nums[0];

        int[] dp = new int[nums.length];
        int option1 = nums[0];
        int option2 = Math.max(nums[0],nums[1]);

        for(int i=2; i<nums.length;i++) {
            int max = Math.max(
                nums[i]+option1,
                option2
            );
            option1 = option2;
            option2 = max;
        }

        return option2;
    }
}
