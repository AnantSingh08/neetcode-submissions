class Solution {
    public int search(int[] nums, int target) {
        // Recursice Binary search
        return binarySearch(0,nums.length-1,nums,target);
    }

    private int binarySearch(int l, int r, int[] nums, int target) {
        if(l>r) return -1;
        int m = l + (r-l)/2;

        if(nums[m] == target) return m;
        if (nums[m] < target) {
            return binarySearch(m+1, r, nums, target);
        } else {
            return binarySearch(l,m-1,nums,target);
        }
    }
}
