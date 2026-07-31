class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max =0;
        for(int i=0; i<nums.length;i++) {
            int count = 1;
            for(int j=i+1;j<nums.length;j++) {
                if(nums[j]==nums[j-1])continue;
                if(nums[j]==nums[j-1]+1) {
                    count++;
                }else{
                    break;
                }
            }
            max = Math.max(max,count);
        }
        return max; 
    }
}
