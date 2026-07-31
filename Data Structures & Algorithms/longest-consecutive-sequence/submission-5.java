class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i: nums) {
            set.add(i);
        }
        int max = 0;

        for(int i: set) {
            if(!set.contains(i-1)) {
                int count = 1;
                int currentNum = i;
                while(set.contains(currentNum+1)) {
                    count++;
                    currentNum++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}
