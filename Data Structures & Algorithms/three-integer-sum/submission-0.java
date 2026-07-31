class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);

        Set<List<Integer>> hset = new HashSet();
        for(int i=2; i<nums.length; i++) {
            for(int j=1; j<i; j++) {
                for(int k=0; k<j; k++) {
                    List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                    if(nums[i]+nums[j]+nums[k]==0 && !hset.contains(temp)) {
                        hset.add(temp);
                        res.add(temp);
                    }
                }
            }
        }
        return res;
    }
}
