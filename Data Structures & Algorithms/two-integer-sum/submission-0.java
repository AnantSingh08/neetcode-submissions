class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i =0 ; i<nums.length ; i++) {
            hashMap.put(nums[i],i);
        }

        for(int i=0 ; i<nums.length; i++) {
            int diff = target - nums[i];
            if(hashMap.containsKey(diff) && hashMap.get(diff)!=i) {
                return new int[]{i, hashMap.get(diff)};
            }
        }
        return new int[0];
    }
}
